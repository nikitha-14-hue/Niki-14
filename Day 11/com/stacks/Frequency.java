package com.stacks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Frequency {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            // Read the contents of the file and count the frequency of each word
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\vepat\\IdeaProjects\\Stacks\\src\\main\\java\\com\\input.txt"))) {
                reader.lines()
                        .flatMap(line -> Stream.of(line.split("\\s+")))
                        .forEach(word -> wordFrequencyMap.merge(word.toLowerCase(), 1, Integer::sum));
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
                return;
            }

            // Display the top N most frequent words
            System.out.println("Top " + N + " most frequent words:");
            final int[] rank = {1};
            wordFrequencyMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(N)
                    .forEach(entry -> System.out.println(rank[0]++ + ". " + entry.getKey() + " - " + entry.getValue() + " occurrences"));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
