/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        string l1value = "", l2value = "";
        while(l1 != nullptr){
            l1value = to_string(l1->val) + l1value;
            l1 = l1->next;
        }
        while(l2 != nullptr){
            l2value = to_string(l2->val) + l2value;
            l2 = l2->next;
        }
        
        string sum = to_string(stoi(l1value) + stoi(l2value));
        ListNode* addedList = new ListNode();
        
        for(int i = 0; i<sum.length(); ++i){
            int value = (int)(sum[sum.length() - 1 - i]);
            
            // TODO
        }
        
        return addedList;
    }
};
