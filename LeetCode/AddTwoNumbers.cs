/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;

        bool iterate = true;
        int carry = 0;

        while(iterate){
            int a = 0;
            int b = 0;

            if(l1 != null){
                a = l1.val;
            }
            if(l2 != null){
                b = l2.val;
            }

            // Summation
            int sum = a + b + carry;

            if(sum >= 10){
                carry = sum/10;
                sum = sum%10;
            }
            else{
                carry = 0;
            }

            ListNode node = new ListNode(sum);
            node.next = head;
            head = node;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            // Finished iterating
            if(l1 == null && l2 == null){
                if(carry != 0){
                    ListNode node1 = new ListNode(carry);
                    node1.next = head;
                    head = node1;
                }
                iterate = false;
            }
        }

        return head;
    }
}
