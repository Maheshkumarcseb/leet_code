#include <iostream>
#include <string>
#include <set>

using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        set<char> charSet;
        int maxLen = 0;

        int start = 0;
        int end = 0;

        while (start < s.size()) {
            auto it = charSet.find(s[start]);
            if (it == charSet.end()) {
                if (start - end + 1 > maxLen)
                    maxLen = start - end + 1;
                charSet.insert(s[start]);
                start++;
            } else {
                charSet.erase(s[end]);
                end++;
            }
        }
        return maxLen;
    }
};

// Main function to test the lengthOfLongestSubstring function
int main() {
    Solution solution;
    string input;

    cout << "Enter a string: ";
    getline(cin, input);

    int length = solution.lengthOfLongestSubstring(input);
    cout << "The length of the longest substring without repeating characters is: " << length << endl;

    return 0;
}
