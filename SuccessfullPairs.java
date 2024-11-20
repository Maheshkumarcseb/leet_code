package leet_code;




import java.util.*;

class SuccessfullPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions); // Sort potions for binary search

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    right = mid - 1; // Move to the left half
                } else {
                    left = mid + 1; // Move to the right half
                }
            }
            ans[i] = m - left; // Remaining potions from `left` to `m-1` are valid
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for spells array
        System.out.print("Enter the number of spells: ");
        int n = scanner.nextInt();
        int[] spells = new int[n];
        System.out.print("Enter the spells: ");
        for (int i = 0; i < n; i++) {
            spells[i] = scanner.nextInt();
        }

        // Input for potions array
        System.out.print("Enter the number of potions: ");
        int m = scanner.nextInt();
        int[] potions = new int[m];
        System.out.print("Enter the potions: ");
        for (int i = 0; i < m; i++) {
            potions[i] = scanner.nextInt();
        }

        // Input for success threshold
        System.out.print("Enter the success threshold: ");
        long success = scanner.nextLong();

        // Create an instance of Solution and call the successfulPairs function
        SuccessfullPairs SuccessfullPairsObj = new SuccessfullPairs();
        int[] result = SuccessfullPairsObj.successfulPairs(spells, potions, success);

        // Print the result
        System.out.println("Successful pairs for each spell:");
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}
