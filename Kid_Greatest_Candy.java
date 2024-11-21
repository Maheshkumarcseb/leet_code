package leet_code;
import java.util.ArrayList;
import java.util.List;

class Kid_Greatest_Candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int i : candies) {
            if (i + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Kid_Greatest_Candy Kid_Greatest_CandyObj = new Kid_Greatest_Candy();

        // Example input
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // Call the method and print the result
        List<Boolean> result = Kid_Greatest_CandyObj.kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);
    }
}
