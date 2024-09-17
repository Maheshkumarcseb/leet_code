package leet_code.ARRAY;
class MissingNumber {

    int missingNumber(int[] nums) {

        int allXOR = 0;
        // A XOR B = B XOR A --> commutative 
        // A XOR 0 = A
        // A XOR A = 0

        // XOR all numbers in range [0, n]
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        // The missing number
        return allXOR;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3}; // Example array with missing number 2

        MissingNumber missingNumber = new MissingNumber();
        int missing = missingNumber.missingNumber(nums);

        System.out.println("The missing number is: " + missing);
    }
}