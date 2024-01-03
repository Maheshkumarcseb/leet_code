#include <iostream>

using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        int n = x;     // storing value of x into an integer n
        long long rev = 0;     // initialise reverse to 0
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            rev = (rev * 10) + (x % 10);   
            x /= 10;    // x=x/10
        }
        return (rev == n);
    }
};

int main() {
    Solution obj;  // creating object for solutuin class
    int num;

    cout << "Enter a number: ";
    cin >> num;    // taking input from user

    if (obj.isPalindrome(num)) {      // calling isPalindrome using object
        cout << num << " is a palindrome." << endl;
    } else {
        cout << num << " is not a palindrome." << endl;
    }

    return 0;
}
