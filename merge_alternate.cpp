#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int i = 0;
        int j = 0;
        string res = "";
        while (i < word1.size() && j < word2.size()) {
            res += word1[i++];
            res += word2[j++];
        }
        while (i < word1.size()) {
            res += word1[i++];
        }
        while (j < word2.size()) {
            res += word2[j++];
        }
        return res;
    }
};

// Main function to test the mergeAlternately function
int main() {
    Solution solution;
    string word1 = "abc";
    string word2 = "pqr";

    string result = solution.mergeAlternately(word1, word2);
    cout << "Merged string: " << result << endl;  // Output should be "apbqcr"

    word1 = "ab";
    word2 = "pqrs";
    result = solution.mergeAlternately(word1, word2);
    cout << "Merged string: " << result << endl;  // Output should be "apbqrs"

    word1 = "abcd";
    word2 = "pq";
    result = solution.mergeAlternately(word1, word2);
    cout << "Merged string: " << result << endl;  // Output should be "apbqcd"

    return 0;
}
