package leet_code.ARRAY;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for (int idx = n - 1; idx >= 0; idx--) {
            while (!helperStack.isEmpty() && temperatures[idx] >= temperatures[helperStack.peek()]) {
                helperStack.pop();
            }

            if (!helperStack.isEmpty()) {
                result[idx] = helperStack.peek() - idx;
            }

            helperStack.push(idx);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = new DailyTemperatures().dailyTemperatures(temperatures);

        System.out.println("Daily temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();

        System.out.println("Number of days to wait for warmer temperature:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


//  time complexity --> O(N) iteration only one time loop
// space complexity --> O(N) using stack