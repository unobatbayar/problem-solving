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
    ListNode* oddEvenList(ListNode* head) {
        if(head == nullptr) return nullptr;

        ListNode* odd = head;
        ListNode* even = odd->next;
        ListNode* evenHead = even; // save for merging

        while(odd->next != nullptr && even->next != nullptr){
            odd->next = even->next; // 2 -> 3
            odd = even->next; // update
            even->next = odd->next; // 3 -> 4
            even = odd->next; // update
        }

        // merge
        odd->next = evenHead;

        return head;
    }
};
