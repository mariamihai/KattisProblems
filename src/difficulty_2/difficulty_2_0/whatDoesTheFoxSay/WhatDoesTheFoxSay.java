package difficulty_2.difficulty_2_0.whatDoesTheFoxSay;

import java.util.Scanner;

public class WhatDoesTheFoxSay {

    private static String questionLine = "what does the fox say?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfTestCases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < nrOfTestCases; i++) {
            String recordingData = scanner.nextLine();

            String line = scanner.nextLine();
            while(isNotQuestion(line)) {
                String animalNoise = line.split(" ")[2];

                recordingData = removeKnownAnimalNoise(recordingData, animalNoise + " ");
                recordingData = removeKnownAnimalNoise(recordingData, " " + animalNoise);
                line = scanner.nextLine();
            }
            recordingData = removeMultipleSpaces(recordingData);

            System.out.println(recordingData);
        }
    }

    private static boolean isNotQuestion(String line) {
        return !questionLine.equals(line);
    }

    private static String removeKnownAnimalNoise(String recordingData, String animalNoise) {
        return recordingData.replaceAll(animalNoise, "");
    }

    private static String removeMultipleSpaces(String recordingData) {
        return recordingData.replaceAll("\\s+", " ").trim();
    }
}
