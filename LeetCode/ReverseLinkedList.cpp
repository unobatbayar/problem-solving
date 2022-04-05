/**
 * Iterative approach
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
    ListNode* reverseList(ListNode* head) {
        ListNode* previous = nullptr;
        
        while(head != nullptr){
            // Save next destination
            ListNode* next = head->next;
            
            // Reverse current node's destination
            head->next = previous;
            
            // Update previous node
            previous = head;
            
            // Continue
            head = next;
        }
        
        return previous;
    }
};

/**
 * Recursive approach
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
    ListNode* reverseList(ListNode* head) {
        return reverse(nullptr, head);
    }
    
private:
    ListNode* reverse(ListNode* previous, ListNode* head){
        if(head == nullptr){
            return previous;
        }
        
        ListNode* next = head->next;
        
        head->next = previous;
                    
        return reverse(head, next);
    }
};
