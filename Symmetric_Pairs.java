package leet_code;
// import java.util.*;
// public class Symmetric_Pairs{
//    public static void main(String[] args) {
//     int n=5;
//     int arr[][] ={{1,2},{2,1},{3,4},{4,5},{5,4}};
//     System.out.println("the symmetric pairs are:");
//     for(int i=0; i<n;i++)
//     {
//         for(int j=i+1;j<n;j++)
//         {
//             if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0])
//             {
//                 System.out.print("(" + arr[i][1] + " " + arr[i][0] +")" + " ");
//                 break;
//             }
//         }
//     }
//    }
    
// }
// Time complexity -->O(n*n)
// Space complexity -->O(1)



import java.util.HashMap;
public class Symmetric_Pairs{
   public static void main(String[] args) {
    int arr[][] ={{1,2},{2,1},{3,4},{4,5},{5,4}};
    HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
    System.out.println("The symmetric pairs are: ");
    for(int i=0;i<arr.length;i++)
    {
        int first =arr[i][0];
        int second=arr[i][1];
        if(mp.get(second) != null && mp.get(second) ==first)
        {
            System.out.print("("+first + " "+ second +")");

        }
        else
        mp.put(first,second);
    }
   }
}
// Time complexity --> O(n)
// space complexity -->O(1)