package leet_code;



import java.util.Scanner;

// Base class with the guess function
class GuessGame {
    private int pick;

    // Constructor to set the picked number
    public GuessGame(int pick) {
        this.pick = pick;
    }

    // Simulated guess API
    public int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return 1;
        else return -1;
    }
}

// Solution class that extends GuessGame
public class Guess_Number extends GuessGame {
    public Guess_Number(int pick) {
        super(pick); // Pass the picked number to the parent class
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid; // Correct guess
            } else if (g == 1) {
                start = mid + 1; // Guess higher
            } else {
                end = mid - 1; // Guess lower
            }
        }
        return -1; // This should not happen if the input is valid
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range and picked number
        System.out.print("Enter the range (1 to n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the picked number: ");
        int pick = scanner.nextInt();

        // Create an instance of Solution
        Guess_Number Guess_Numberobj = new Guess_Number(pick);

        // Find the guessed number
        int guessedNumber = Guess_Numberobj.guessNumber(n);
        System.out.println("The guessed number is: " + guessedNumber);

        scanner.close();
    }
}
