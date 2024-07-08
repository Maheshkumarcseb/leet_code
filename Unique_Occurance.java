package leet_code;


import java.util.HashMap;
import java.util.HashSet;

public class Unique_Occurance {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : arr) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> unique_vals = new HashSet<>(maps.values());
        return maps.size() == unique_vals.size();
    }

    public static void main(String[] args) {
        Unique_Occurance obj = new Unique_Occurance();

        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println("Unique occurrences in arr1: " + obj.uniqueOccurrences(arr1)); // Expected: true

        int[] arr2 = {1, 2};
        System.out.println("Unique occurrences in arr2: " + obj.uniqueOccurrences(arr2)); // Expected: false

        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println("Unique occurrences in arr3: " + obj.uniqueOccurrences(arr3)); // Expected: true
    }
}
