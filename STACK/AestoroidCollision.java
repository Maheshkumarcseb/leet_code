package leet_code.STACK;



import java.util.*;

class AestoroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int ele : asteroids) {
            boolean destroyed = false;

            // Handle collision only if the current asteroid is moving left (negative)
            while (!st.isEmpty() && ele < 0 && st.peek() > 0) {
                if (st.peek() < Math.abs(ele)) {
                    st.pop(); // Top asteroid is destroyed
                } else if (st.peek() == Math.abs(ele)) {
                    st.pop(); // Both asteroids are destroyed
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid is destroyed
                    break;
                }
            }

            // If the current asteroid is not destroyed, push it onto the stack
            if (!destroyed) {
                st.push(ele);
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    // Main function to test the asteroidCollision method
    public static void main(String[] args) {
        AestoroidCollision AestoroidCollisionobj = new AestoroidCollision();

        // Test case 1
        int[] asteroids1 = {5, 10, -5};
        System.out.println("Output for test case 1: " + Arrays.toString(AestoroidCollisionobj.asteroidCollision(asteroids1)));

        // Test case 2
        int[] asteroids2 = {8, -8};
        System.out.println("Output for test case 2: " + Arrays.toString(AestoroidCollisionobj.asteroidCollision(asteroids2)));

        // Test case 3
        int[] asteroids3 = {10, 2, -5};
        System.out.println("Output for test case 3: " + Arrays.toString(AestoroidCollisionobj.asteroidCollision(asteroids3)));

        // Test case 4
        int[] asteroids4 = {-2, -1, 1, 2};
        System.out.println("Output for test case 4: " + Arrays.toString(AestoroidCollisionobj.asteroidCollision(asteroids4)));

        // Additional test case
        int[] asteroids5 = {-2, 1, -1, 2};
        System.out.println("Output for additional test case: " + Arrays.toString(AestoroidCollisionobj.asteroidCollision(asteroids5)));
    }
}
