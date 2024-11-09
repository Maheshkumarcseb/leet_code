package leet_code.STRING;

public class Reverse_Word_String {
     static String reverseWords(String s)
    {
        char [] arr = s.toCharArray();  //  converting the string to character array.
                                        // the charaxter array every word will be seperated by space
        int left=0,right=0;
        while(right<arr.length)
        {
            if(arr[right]==' ')
            {
                reverse(arr,left,right-1);
                left=right+1;
            }
            right++;
        }
        reverse(arr,left,right-1);

        return new String(arr);
    }
    static void reverse(char[] arr, int left, int right)
    {
        while(left<right)
        {
            char temp = arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }
    public static void main(String[] args) {
        String s="my name is mahesh kumar";    //  output:-  ym eman si hseham ramuk
        System.out.println("string before reverse");
        System.out.println(s);
         String revstr=reverseWords(s);
        System.out.println("string after reverse");
        System.out.println(revstr);
    }
    
}
