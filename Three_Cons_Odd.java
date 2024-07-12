package leet_code;
public class Three_Cons_Odd {
    public boolean threeConsecutiveOdds(int[] arr) {
        int streak = 0;
        for (int i : arr) {
            if (i % 2 == 1) { // Check if the number is odd
                streak++;
                if (streak == 3) return true; // Return true if three consecutive odds are found
            } else {
                streak = 0; // Reset streak if an even number is found
            }
        }
        return false; // Return false if no three consecutive odds are found
    }

    public static void main(String[] args) {
        Three_Cons_Odd obj = new Three_Cons_Odd();

        // Sample input
        int[] arr = {2, 6, 4, 1, 3, 5, 8};

        // Call the method with the sample input
        boolean result = obj.threeConsecutiveOdds(arr);

        // Print the result
        System.out.println("Are there three consecutive odds? " + result);

        // Another test case
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        boolean result2 = obj.threeConsecutiveOdds(arr2);
        System.out.println("Are there three consecutive odds? " + result2);

        // Another test case
        int[] arr3 = {1, 3, 5, 7, 9, 11};
        boolean result3 = obj.threeConsecutiveOdds(arr3);
        System.out.println("Are there three consecutive odds? " + result3);
    }
}
