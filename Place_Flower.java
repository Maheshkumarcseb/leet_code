package leet_code;

import java.util.Arrays;
import java.util.List;

public class Place_Flower {

    public boolean canPlaceFlowers(List<Integer> flowerbed, int n) {
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.size(); i++) {
            if (flowerbed.get(i) == 0 
                && (i == 0 || flowerbed.get(i - 1) == 0) 
                && (i == flowerbed.size() - 1 || flowerbed.get(i + 1) == 0)) {
                
                flowerbed.set(i, 1);
                n--;

                if (n == 0) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Place_Flower obj = new Place_Flower();

        List<Integer> flowerbed1 = Arrays.asList(1, 0, 0, 0, 1);
        int n1 = 1;
        System.out.println();
        System.out.println("Can place " + n1 + " flowers: " + obj.canPlaceFlowers(flowerbed1, n1)); // Expected: true

        List<Integer> flowerbed2 = Arrays.asList(1, 0, 0, 0, 1);
        int n2 = 2;
        System.out.println("Can place " + n2 + " flowers: " + obj.canPlaceFlowers(flowerbed2, n2)); // Expected: false

        List<Integer> flowerbed3 = Arrays.asList(0, 0, 1, 0, 0);
        int n3 = 1;
        System.out.println("Can place " + n3 + " flowers: " + obj.canPlaceFlowers(flowerbed3, n3)); // Expected: true

        List<Integer> flowerbed4 = Arrays.asList(0, 0, 1, 0, 0, 0, 0);
        int n4 = 2;
        System.out.println("Can place " + n4 + " flowers: " + obj.canPlaceFlowers(flowerbed4, n4)); // Expected: true
    }
}
