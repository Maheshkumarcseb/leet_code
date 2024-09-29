package leet_code;

import java.util.Arrays;

public class CountInversions {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int n = arr.length;
        int[] temp = new int[n]; // Corrected array size
        int ans = mergeSort(arr, temp, 0, n - 1);
        System.out.println("Number of inversions: " + ans); // Print the result
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        int invCount = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i; // Corrected inversion count calculation
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, left, arr, left, right - left + 1); // Corrected array copying

        return invCount;
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;

        if (right > left) {
            mid = (left + right) / 2;

            // Recursive calls with corrected parameters
            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid, right);
        }

        return invCount;
    }
}