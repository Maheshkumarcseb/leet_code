#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;

        for (const int num : nums)           // for each loop to iterate the loop   
        // i<1  --> for storing the first element of vector
        //num>nums[i-1]  --> checking current element is greater than previous element order or not      
        // because given vector is in increasing order
        if (i < 1 || num > nums[i - 1])  
        nums[i++] = num;
        return i; 
    }
};
int main() {
    Solution solution;
    vector<int> nums = {2,3, 5, 9, 87 ,87, 90, 90};
    int newsize = solution.removeDuplicates(nums);

    cout << "Modified vector: ";
    for (int i = 0; i < newsize; i++) {
        cout << nums[i] << " ";
    }

    cout << "\nNew size: " << newsize;
    return 0;
}
