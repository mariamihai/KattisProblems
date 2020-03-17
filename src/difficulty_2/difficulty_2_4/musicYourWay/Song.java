package difficulty_2.difficulty_2_4.musicYourWay;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Song {

    private Map<Integer, String> attributes;

    private Song(String[] splitted) {
        attributes = new HashMap<>();

        for(int i = 0; i < splitted.length; i++) {
            attributes.put(i, splitted[i]);
        }
    }

    public String getAttribute(Integer position) {
        return attributes.get(position);
    }

    public static Song generateSong(String line) {
        String[] splitted = line.split(" ");

        return new Song(splitted);
    }

    public void printAttributes() {
        System.out.println(String.join(" ", attributes.values()));
    }
}
