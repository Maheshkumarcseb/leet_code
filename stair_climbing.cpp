#include <iostream>
using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        if (n == 1)
            return 1;
        int dp[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
};

int main() {
    Solution solution;
    int n;
    cout << "Enter the number of stairs: ";
    cin >> n;
    cout << "Number of ways to climb " << n << " stairs: " << solution.climbStairs(n) << endl;
    return 0;
}
