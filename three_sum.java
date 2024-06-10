package leet_code;




import java.util.*;

class three_sum{
    public static List<List<Integer>> threeSum(int[] arr) {
        if (arr == null || arr.length < 3) return new ArrayList<>();

        // Sort the elements
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        // Now fix the first element and find the other two elements
        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Find other two elements using Two Sum approach
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Add the set, and move to find other triplets
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicate elements
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        three_sum solution = new three_sum();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = three_sum.threeSum(arr);
        
        System.out.println("Triplets that sum up to 0 are:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

