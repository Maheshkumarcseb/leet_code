package leet_code;
import java.util.Scanner;
class Nth_Tribonnaci_Series {
    public int tribonacci(int n) {
            int[] arr = {0, 1, 1};
    
            if (n <= 2)
                return arr[n];
            for (int i = 3; i <= n; i++) {
                int temp = arr[0] + arr[1] + arr[2];
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            }
            return arr[2];
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            
            Nth_Tribonnaci_Series Nth_Tribonnaci_Seriesobj = new Nth_Tribonnaci_Series();
            int result = Nth_Tribonnaci_Seriesobj.tribonacci(n);
            System.out.println("The " + n + "th Tribonacci number is: " + result);
            
            scanner.close();
        }
    }
    