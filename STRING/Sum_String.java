package leet_code.STRING;
public class Sum_String {

    static int findSum(String str)
    {
        String tempsum="0";       //tempSum: This variable is used to store the digits encountered sequentially. It's initialized to "0".
        int sum=0;               //sum: This variable accumulates the sum of the numbers extracted from the string.
        for(int i=0; i<str.length(); i++)
        {
            char s= str.charAt(i);  

            if(Character.isDigit(s))  
                tempsum+=s;     //If the character is a digit, it's appended to the tempSum string.
            else
            {
                sum+=Integer.parseInt(tempsum);   //tempSum is converted to an integer and added to the sum
                tempsum ="0";
            }

        }
        return sum+ Integer.parseInt(tempsum);
    }
    public static void main(String[] args) {
        String str="1bc268";
        System.out.println("sum: ");
        System.out.println(findSum(str));
    }
}
