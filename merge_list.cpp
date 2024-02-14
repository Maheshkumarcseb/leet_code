#include <iostream>

using namespace std;

// Definition for singly-linked list
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}  //constructor of ListNode and it initialise the both variable 
};

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (!list1 || !list2)
            return list1 ? list1 : list2;
        if (list1->val > list2->val)
            swap(list1, list2);
        list1->next = mergeTwoLists(list1->next, list2);
        return list1;
    }
};

// Function to print the linked list
void printList(ListNode* head) {
    while (head) {
        cout << head->val << " ";
        head = head->next;
    }
    cout << endl;
}

// Function to create a linked list from user input
ListNode* createList() {
    ListNode* head = nullptr;
    ListNode* tail = nullptr;
    int val;
    char choice;
    do {
        cout << "Enter value: ";
        cin >> val;
        ListNode* newNode = new ListNode(val);
        if (!head) {
            head = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            tail = tail->next;
        }
        cout << "Do you want to add another node? (y/n): ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');
    return head;
}

int main() {
    // Create the first list
    cout << "Enter elements for the first list:" << endl;
    ListNode* l1 = createList();

    // Create the second list
    cout << "Enter elements for the second list:" << endl;
    ListNode* l2 = createList();

    // Merge the lists
    Solution sol;
    ListNode* mergedList = sol.mergeTwoLists(l1, l2);

    // Print the merged list
    cout << "Merged list: ";
    printList(mergedList);

    return 0;
}
