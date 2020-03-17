package difficulty_2.difficulty_2_4.musicYourWay;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MusicYourWay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> positionAttributes = new HashMap<>();

        // Set the attributes names
        String[] splitted = line.split(" ");
        IntStream.rangeClosed(0, splitted.length - 1).forEach(x -> positionAttributes.put(splitted[x], x));

        // Get the songs
        int nrSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for(int i = 0; i < nrSongs; i++) {
            songs.add(Song.generateSong(scanner.nextLine()));
        }

        // Get the attributes to be used in sorting
        int nrSortAttributes = Integer.parseInt(scanner.nextLine());
        List<String> sortAttributes = new LinkedList<>();
        for(int i = 0; i < nrSortAttributes; i++) {
            sortAttributes.add(scanner.nextLine());
        }

        // Sort & print the songs
        for(String sortAttribute : sortAttributes) {
            Integer position = positionAttributes.get(sortAttribute);
            songs = sort(songs, position);
            print(line, songs);
        }

        scanner.close();
    }

    private static List<Song> sort(List<Song> songs, int position) {
        return songs.stream().sorted(Comparator.comparing(song -> song.getAttribute(position))).collect(Collectors.toList());
    }

    private static void print(String header, List<Song> songs) {
        System.out.println(header);

        for(Song song : songs) {
            song.printAttributes();
        }

        System.out.println();
    }
}
