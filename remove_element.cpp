#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int i = 0;
        // for each loop for array traversing and checking whether val is present in array or not
        for (const int num : nums)
            if (num != val)
                nums[i++] = num;
        
        return i;
    }
};

int main() {
    // Example usage
    Solution solution;

    // Create a vector of integers
    vector<int> nums = {3, 2, 2, 3, 4, 5, 3, 6};
    // Value to be removed
    int valToRemove = 3;

    // Call the removeElement function
    int newSize = solution.removeElement(nums, valToRemove);

    // Print the modified vector and its size
    cout << "Modified Vector: ";
    for (int i = 0; i < newSize; ++i) {
        cout << nums[i] << " ";
    }
    cout << "\nNew Size: " << newSize <<endl;

    return 0;
}
