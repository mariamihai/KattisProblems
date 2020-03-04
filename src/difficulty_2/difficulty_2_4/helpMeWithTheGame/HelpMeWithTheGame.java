package difficulty_2.difficulty_2_4.helpMeWithTheGame;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelpMeWithTheGame {

    private static final String BLACK_FIELD = ":::";
    private static final String WHITE_FIELD = "...";
    private static Map<Integer, String> locations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> groupedPieces = new HashMap<>();
        groupedPieces.put("K", new ArrayList<>());
        groupedPieces.put("k", new ArrayList<>());
        groupedPieces.put("Q", new ArrayList<>());
        groupedPieces.put("q", new ArrayList<>());
        groupedPieces.put("R", new ArrayList<>());
        groupedPieces.put("r", new ArrayList<>());
        groupedPieces.put("B", new ArrayList<>());
        groupedPieces.put("b", new ArrayList<>());
        groupedPieces.put("N", new ArrayList<>());
        groupedPieces.put("n", new ArrayList<>());
        groupedPieces.put("P", new ArrayList<>());
        groupedPieces.put("p", new ArrayList<>());

        locations = new HashMap<>();
        locations.put(1, "a");
        locations.put(2, "b");
        locations.put(3, "c");
        locations.put(4, "d");
        locations.put(5, "e");
        locations.put(6, "f");
        locations.put(7, "g");
        locations.put(8, "h");

        int cnt = 8;
        for(int i = 0; i < 17; i++) {
            String line = scanner.nextLine();

            // Only the odd lines contain the chessboard
            if(i % 2 == 1) {
                String[] fields = getFields(line);

                Map<String, List<String>> currentStepPieces = getCurrentRowPieces(cnt, fields);

                for(String pieceType : groupedPieces.keySet()) {
                    groupedPieces.computeIfPresent(pieceType, (key, value) -> {
                        if(currentStepPieces.containsKey(pieceType)) {
                            value.addAll(currentStepPieces.get(pieceType));
                        }
                       return value;
                    });
                }
                cnt--;
            }
        }

        // sort the values in each list
        sortPieces(groupedPieces);

        printResult(groupedPieces);

        scanner.close();
    }

    private static String[] getFields (String line) {
//        return Arrays.copyOfRange(line.split("\\|"), 1, 9);
        return line.split("\\|");
    }

    private static boolean isNotBlankField(String field) {
        return !BLACK_FIELD.equals(field) && !WHITE_FIELD.equals(field) && !"".equals(field);
    }

    private static String getPieceFromField(String field, int x) {
        String[] splitted = field.split("");

        // if pawn, don't print 'p' or 'P'
        if("p".equals(splitted[1].toLowerCase())) return locations.get(x);
        return field.split("")[1].toUpperCase() + locations.get(x);
    }

    private static Map<String, List<String>> getCurrentRowPieces(int rowNr, String[] fields) {
        Map<String, List<String>> currentPieces = new HashMap<>();

        for(int i = 1; i <= 8; i++ ) {
            if(isNotBlankField(fields[i])) {
                String piece = getPieceFromField(fields[i], i) + rowNr;

                currentPieces.compute(getPieceType(fields[i]), (key, value) -> {
                    if (value == null) value = new ArrayList<>();
                    value.add(piece);
                    return value;
                });
            }
        }

        return currentPieces;
    }

    private static String getPieceType(String piece) {
        return piece.substring(1, 2);
    }

    private static void sortPieces(Map<String, List<String>> groupedPieces) {
        for(Map.Entry<String, List<String>> entry : groupedPieces.entrySet()) {
            entry.getValue().sort((o1, o2) -> {
                int rn1 = rowNumber(o1);
                int rn2 = rowNumber(o2);


                if(areWhitePieces(entry.getKey())) {
                    if (rn1 > rn2) return +1;
                    if (rn1 < rn2) return -1;
                } else {
                    if (rn1 > rn2) return -1;
                    if (rn1 < rn2) return +1;
                }

                return o1.compareTo(o2);
            });
        }
    }

    private static boolean areWhitePieces(String type) {
        return type.equals(type.toUpperCase());
    }

    private static int rowNumber(String piece) {
        String[] splitted = piece.split("");
        return Integer.parseInt(splitted[splitted.length-1]);
    }

    private static void printResult(Map<String, List<String>> groupedPieces) {
        System.out.println(buildResult(groupedPieces, "White: ", String::toUpperCase));
        System.out.println(buildResult(groupedPieces, "Black: ", String::toLowerCase));
    }

    private static String buildResult(Map<String, List<String>> groupedPieces, String text, Function<String, String> f) {
        StringBuilder builder = new StringBuilder();

        builder.append(text);
        if(!groupedPieces.isEmpty()) {
            List<String> orderedPieces = new LinkedList<>();
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("K"))));
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("Q"))));
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("R"))));
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("B"))));
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("N"))));
            orderedPieces.add(String.join(",", groupedPieces.get(f.apply("P"))));

            String result = orderedPieces.stream().filter(s -> !"".equals(s)).collect(Collectors.joining(","));
            builder.append(result);
        }

        return builder.toString();
    }
}