package leet_code.ARRAY;
public class SortColors {
    public void sortcolors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    // Swap with start index
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap with end index
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColorsobj = new SortColors();
        
        // Example test case
        int[] colors = {2, 0, 2, 1, 1, 0};
        
        System.out.println("Before sorting: ");
        printArray(colors);
        
        sortColorsobj.sortcolors(colors);
        
        System.out.println("After sorting: ");
        printArray(colors);
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
