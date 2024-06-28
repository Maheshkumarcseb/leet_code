package leet_code;
import java.util.Scanner;
public class rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("enter the value of key");
        int key=sc.nextInt();

        //reversing the all element of array
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println("reversed array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //reversing the first k element of array
        int low1=0;
        int high1=key-1;
        while(low1<high1)
        {
            int temp=arr[low1];
            arr[low1]=arr[high1];
            arr[high1]=temp;
            low1++;
            high1--;
        }
        System.out.println("reveresed first k element");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // reversing the second half of the array
        int low2=key;
        int high2=arr.length-1;
        while(low2<high2)
        {
            int temp=arr[low2];
            arr[low2]=arr[high2];
            arr[high2]=temp;
            low2++;
            high2--;
        }
        System.out.println("reversed 2nd half element");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


// public class rotate_array{
//     public static void rotate(int []nums, int k){
//         k %=nums.length;
//         reverse(nums, 0, nums.length-1);
//         reverse(nums, 0, k-1);
//         reverse(nums, k, nums.length-1);
//     }
//     public static void reverse(int[] nums, int start, int end)
//     {
//         while(start<end)
//         {
//             int temp=nums[start];
//             nums[start]=nums[end];
//             nums[end]=temp;
//             start++;
//             end--;
//         }
//     }
// }