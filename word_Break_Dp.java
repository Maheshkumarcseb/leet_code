package leet_code;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class WordBreakDP {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        int maxLen = 0;
        for (String word : wordDict)
            maxLen = Math.max(maxLen, word.length());
        
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLen); j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for string
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        // Taking input for dictionary words
        System.out.println("Enter the number of words in dictionary:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter the dictionary words:");
        for (int i = 0; i < n; i++) {
            wordDict.add(sc.nextLine());
        }

        // Creating object and checking word break
        WordBreakDP wb = new WordBreakDP();
        boolean result = wb.wordBreak(str, wordDict);

        System.out.println("Can the string be segmented? " + result);

        sc.close();
    }
}
