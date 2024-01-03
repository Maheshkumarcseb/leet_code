#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();          // it will give the size of vector
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {  // matching the answer with possible input pairs
                    return {i, j};
                }
            }
        }
        return {}; 
    }
};

int main() {
    Solution obj;          // object of Solution class
    vector<int> num = {2, 7, 11, 15};   // vector to store element and we can increase the size of vector dynamically
    int tar = 9;                        // num and result are variable name used to store element
    vector<int> result = obj.twoSum(num, tar);  // calling twoSum function with the help of object

    if (!result.empty()) {  //checking whether result is empty.
        cout << "Indices: " << result[0] << " " << result[1] << endl;
    } else {
        cout << "No solution found." << endl;
    }

    return 0;
}




