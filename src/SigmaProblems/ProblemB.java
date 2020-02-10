package SigmaProblems;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiFunction;

/**
 * 3.9. Honey Heist - DONE
 */
public class ProblemB {

    private int R, N, A, B, X;

    // sets cell to true - visited or false - not visited
    private boolean[] visited;
    // number of cells on each row
    private int[] columnMax;
    // the neighbours for each cell
    private TreeMap<Integer, LinkedList<Integer>> adjacencyMap;
    // the parent cell number for each cell
    private int[] parent;
    // the distance from source to each cell
    private int[] distance;

    private int totalNumberOfHexagons;
    private int firstHalfHexagons;

    private static Integer NO_PATH = -1;
    private static String INVALID_MESSAGE = "No";
    private static Boolean VISITED = Boolean.TRUE;
    private static Boolean NOT_VISITED = Boolean.FALSE;

    // upper left | upper right | down left | down right
    private static int[][] FIRST_HALF = {{-1, -1}, {-1, 0}, {1, 0}, {1, 1}};
    private static int[][] MIDDLE = {{-1, -1}, {-1, 0}, {1, -1}, {1, 0}};
    private static int[][] SECOND_HALF = {{-1, 0}, {-1, 1}, {1, -1}, {1, 0}};
    private static int UPPER_LEFT = 0;
    private static int UPPER_RIGHT = 1;
    private static int DOWN_LEFT = 2;
    private static int DOWN_RIGHT = 3;
    private static int ROW = 0;
    private static int COLUMN = 1;


    public static void main(String[] args) {
        ProblemB b = new ProblemB();

        Scanner scanner = new Scanner(System.in);

        // Read values R N A B X (in this order)
        // the length (number of cells) of each edge of the grid
        b.R = scanner.nextInt();
        // the maximum number of cells 0x67 can chew through
        b.N = scanner.nextInt();
        // the starting cell ID
        b.A = scanner.nextInt();
        // the cell ID of the cell containing the honey
        b.B = scanner.nextInt();
        // the number of wax-hardened cells
        b.X = scanner.nextInt();

        b.initiateData();

        // read the wax-hardened cells
        for(int i = 0; i < b.X; i++) {
            int waxHardenedCell = scanner.nextInt();
            b.visited[waxHardenedCell] = Boolean.TRUE;
        }

        b.constructHoneycomb();

        // The distance between the source cell and the destination cell
        int K = b.bfs(b.A, b.B);
        if(K > b.N || K == NO_PATH) {
            System.out.println(INVALID_MESSAGE);
        } else {
            System.out.println(K);
        }
    }

    private int bfs (int source, int destination) {
        LinkedList<Integer> queue = new LinkedList<>();
        visited[source] = VISITED;
        queue.add(source);

        while(!queue.isEmpty()) {
            int cell = queue.removeFirst();

            for(Integer neighbour : adjacencyMap.get(cell)) {
                if(NOT_VISITED.equals(visited[neighbour])) {
                    if(neighbour == destination) return distance[cell] + 1;

                    parent[neighbour] = cell;
                    distance[neighbour] = distance[cell] + 1;
                    visited[neighbour] = VISITED;
                    queue.add(neighbour);
                }
            }
        }

        return -1;
    }

    private void initiateData() {
        totalNumberOfHexagons = (int) (Math.pow(R, 3) - Math.pow(R - 1, 3));
        firstHalfHexagons = (R - 1) * R + R * (R + 1) / 2;

        // To make the problem easier to follow I decided to start from index 1 for all arrays related to the honeycomb
        // and the TreeMap
        columnMax = new int[2 * R];
        visited = new boolean[totalNumberOfHexagons + 1];
        adjacencyMap = new TreeMap<>();
        parent = new int[totalNumberOfHexagons + 1];
        distance = new int[totalNumberOfHexagons + 1];

        // Set the number of cell on each row
        for (int i = 1; i <= R; i++) {
            columnMax[i] = R + i - 1;
        }
        for(int i = R + 1; i <= 2*R - 1; i++) {
            columnMax[i] = 3 * R - i - 1;
        }
    }

    private void constructHoneycomb() {
        for(int i = 1; i <= 2 * R - 1; i++) {
            for(int j = 1; j <= columnMax[i]; j++) {
                int nr = constructCellNumber(i, j);

                if(i < R)  addUpperAndDownNeighbours(nr, i, j, FIRST_HALF);
                if(i == R) addUpperAndDownNeighbours(nr, i, j, MIDDLE);
                if(i > R)  addUpperAndDownNeighbours(nr, i, j, SECOND_HALF);

                // left and right neighbours
                addNeighbourIfValid(nr, nr - 1, i, j, this::hasValidLeftNeighbour);
                addNeighbourIfValid(nr, nr + 1, i, j, this::hasValidRightNeighbour);
            }
        }
    }

    private void addUpperAndDownNeighbours(int nr, int i, int j, int[][] matrix) {
        // upper neighbours
        addNeighbourIfValid(nr, i + matrix[UPPER_LEFT][ROW], j + matrix[UPPER_LEFT][COLUMN], this::hasValidUpperLeftNeighbour);
        addNeighbourIfValid(nr,  i + matrix[UPPER_RIGHT][ROW], j + matrix[UPPER_RIGHT][COLUMN], this::hasValidUpperRightNeighbour);
        // down neighbours
        addNeighbourIfValid(nr, i + matrix[DOWN_LEFT][ROW], j + matrix[DOWN_LEFT][COLUMN], this::hasValidDownLeftNeighbour);
        addNeighbourIfValid(nr,i + matrix[DOWN_RIGHT][ROW], j + matrix[DOWN_RIGHT][COLUMN], this::hasValidDownRightNeighbour);
    }

    private void addNeighbourIfValid(int nr, int row, int column, BiFunction<Integer, Integer, Boolean> f) {
        if(f.apply(row, column)) {
            addToMap(nr, constructCellNumber(row, column));
        }
    }

    private void addNeighbourIfValid(int nr1, int nr2, int row, int column, BiFunction<Integer, Integer, Boolean> f) {
        if(f.apply(row, column)) {
            addToMap(nr1, nr2);
        }
    }

    private int constructCellNumber(int row, int column) {
        if(row <= R) {
            return (R - 1) * (row - 1) + (row - 1) * row / 2 + column;
        } else {
            return firstHalfHexagons +
                    (3 * R - 1) * (row - R - 1) - R * (row - R - 1) - (row - R - 1) * (row - R) / 2 + column;
        }
    }

    private void addToMap(int initialCell, int neighbourCell) {
        LinkedList<Integer> neighbour = new LinkedList<>();
        neighbour.add(neighbourCell);

        adjacencyMap.merge(initialCell, neighbour, (list, newNeighbour) -> {
            list.addAll(newNeighbour);
            return list;
        });
    }

    private boolean hasValidLeftNeighbour(int row, int column) {
        return 0 < column - 1;
    }
    private boolean hasValidRightNeighbour(int row, int column) {
        return (column + 1) <= columnMax[row];
    }
    private boolean hasValidUpperLeftNeighbour(int row, int column) {
        return (0 < row) && (0 < column);
    }
    private boolean hasValidUpperRightNeighbour(int row, int column) {
        return (0 < row) && (column <= columnMax[row]);
    }
    private boolean hasValidDownLeftNeighbour(int row, int column) {
        return (row <= 2 * R - 1) && (0 < column);
    }
    private boolean hasValidDownRightNeighbour(int row, int column) {
        return (row <= (2 * R - 1)) && (column <= columnMax[row]);
    }
}
