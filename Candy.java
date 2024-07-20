

package leet_code;
import java.util.Arrays;

public class Candy  {
    public int candy(int[] ratings) {
        int[] ans = new int[ratings.length];
        Arrays.fill(ans, 1);

        // Traverse from left to right
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                ans[i] = ans[i - 1] + 1;
            }
        }

        // Traverse from right to left
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1] && ans[i] >= ans[i - 1]) {
                ans[i - 1] = ans[i] + 1;
            }
        }

        // Return the sum of all candies
        return Arrays.stream(ans).sum();
    }

    public static void main(String[] args) {
        Candy obj = new Candy ();

        // Example usage
        int[] ratings = {1, 0, 2};
        System.out.println("Total candies required: " + obj.candy(ratings)); // Output: 5

        int[] ratings2 = {1, 2, 2};
        System.out.println("Total candies required: " + obj.candy(ratings2)); // Output: 4
    }
}
