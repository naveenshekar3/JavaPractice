package javaPrograms;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsConcepts {
    public static void main(String[] args) {

        // Problem 1: Square each number and sum them
        int sum = Stream.of(1, 2, 3, 4)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Problem 1 Output: " + sum);

        // Problem 2: Filter words longer than 4 chars, then uppercase
        List<String> words = List.of("java", "stream", "api", "examples");
        List<String> result = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Problem 2 Output: " + result);

        // Problem 3: Character frequency from a word
        String text = "banana";
        Map<Character, Long> freq = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Problem 3 Output: " + freq);

        // Problem 4: Partition numbers into even and odd
        Map<Boolean, List<Integer>> parts = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Problem 4 Output: " + parts);

        // Problem 5: Distinct and sorted names
        List<String> uniqueSorted = Stream.of("bob", "alice", "bob", "carol")
                .distinct()
                .sorted()
                .toList();
        System.out.println("Problem 5 Output: " + uniqueSorted);

        // Problem 6: Flatten a list of lists
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> flat = nested.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Problem 6 Output: " + flat);

        // Problem 7: Find the longest word
        String longest = Stream.of("java", "microservices", "spring")
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Problem 7 Output: " + longest);

        // Problem 8: Validate list with match operations
        List<Integer> checkNumbers = List.of(1, -2, 3, 5);
        boolean allPositive = checkNumbers.stream().allMatch(n -> n > 0);
        boolean anyEven = checkNumbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Problem 8 Output: allPositive=" + allPositive + ", anyEven=" + anyEven);

        // Problem 9: Sum of first N numbers using IntStream
        int n = 10;
        int rangeSum = IntStream.rangeClosed(1, n).sum();
        System.out.println("Problem 9 Output: " + rangeSum);

        // Problem 10: Convert list of objects to map
        record User(int id, String name) {}
        List<User> users = List.of(new User(1, "A"), new User(2, "B"));
        Map<Integer, String> userMap = users.stream()
                .collect(Collectors.toMap(User::id, User::name));
        System.out.println("Problem 10 Output: " + userMap);

        // Problem 11: Join strings with delimiter
        String joined = String.join(",", List.of("a", "b", "c"));
        System.out.println("Problem 11 Output: " + joined);

        // Problem 12: Find first word starting with 'b'
        Optional<String> found = Stream.of("apple", "banana", "pear")
                .filter(w -> w.startsWith("b"))
                .findFirst();
        System.out.println("Problem 12 Output: " + found.orElse("not found"));

        // Problem 13: Sum of adjacent pairs
        List<Integer> list = List.of(1, 2, 3, 4);
        List<Integer> pairSums = IntStream.range(0, list.size() - 1)
                .mapToObj(i -> list.get(i) + list.get(i + 1))
                .toList();
        System.out.println("Problem 13 Output: " + pairSums);

        // Problem 14: Count numbers divisible by 7 in a range (parallel stream)
        long count = IntStream.range(1, 1_000)
                .parallel()
                .filter(x -> x % 7 == 0)
                .count();
        System.out.println("Problem 14 Output: " + count);
    }
}