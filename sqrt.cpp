#include <iostream>

using namespace std;

class Solution {
public:
    int mySqrt(int x) {
        unsigned low = 1;
        unsigned high = x + 1u;

        while (low < high) {
            const unsigned mid = (low + high) / 2;
            if (mid > x / mid)
                high = mid;
            else
                low = mid + 1;
        }

        // l := the minimum number s.t. l * l > x
        return low - 1;
    }
};

int main() {
    int x;
    cout << "Enter a number: ";
    cin >> x;

    Solution sol;
    cout << "Square root of " << x << " is: " << sol.mySqrt(x) << endl;

    return 0;
}
