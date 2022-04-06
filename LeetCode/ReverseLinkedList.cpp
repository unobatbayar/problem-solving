/**
 * Iterative approach
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
