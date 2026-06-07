package Assignment1;

import java.util.*;
import java.util.stream.*;

public class Q19_Streams {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 15, 25, 35, 45);

        // Map → square
        List<Integer> result = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + result);

        // Reduce → sum
        int total = nums.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + total);

        // Count → numbers > 20
        long cnt = nums.stream()
                .filter(n -> n > 20)
                .count();
        System.out.println("Count >20: " + cnt);

        // Sort
        List<Integer> sortedList = nums.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedList);
    }
}
