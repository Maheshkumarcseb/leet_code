//Question --->https://leetcode.com/problems/find-the-highest-altitude/submissions/1317619432/?envType=study-plan-v2&envId=leetcode-75
package leet_code;

public class Highest_Altitide {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Highest_Altitide obj = new Highest_Altitide();

        // Sample input
        int[] gain = {-5, 1, 5, 0, -7};
        int result = obj.largestAltitude(gain);

        // Print the result
        System.out.println("The largest altitude is: " + result);
    }
}
