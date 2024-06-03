#include <iostream>
#include <string>
using namespace std;
class Solution {
public:
    int lengthOfLastWord(const std::string& s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // A letter is found so count
            if (s[i] != ' ') {
                count++;
            } else {
                // It's a white space instead
                // Did we already start to count a word?
                // Yes, so we found the last word
                if (count > 0)
                    return count;
            }
        }

        return count;
    }
};

int main() {
    Solution solution;
    string input;

    std::cout << "Enter a string: ";
    getline(std::cin, input);

    int length = solution.lengthOfLastWord(input);
    cout << "Length of the last word: " << length << std::endl;

    return 0;
}
