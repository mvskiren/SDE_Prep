/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return null;
        boolean flag=false;
        int prev_val=head.val; // intial data
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode end=head;
        while(curr!=null){
            if(curr.val!=prev_val) {
                prev.next=curr;
                prev=curr;
                prev_val=curr.val;
                flag=true; 
            }
            end=curr;
             curr=curr.next; 
        }
        if(end.val==prev.val) {
             prev.next=null;
          }
        return head; 
    }
}