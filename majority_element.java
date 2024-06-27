package leet_code;

// import java.util.Scanner;

// public class majority_element {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[]{ 1,2,2,2,2,1,1 }; 
//         int num,count=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++)
//         {
//             num=arr[i];
//             for(int j=0;j<n;j++)
//             {
//                 if(num==arr[j])
//                     count++;
//             }
        
//         if(count>n/2)
//         {
//             System.out.println(num);
//             break;
//         }
//         count=0;
//         }

//     }
// }





import java.util.*;

public class majority_element {
    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}
