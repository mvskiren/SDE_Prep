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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int m=left;
        int n=right;
        ListNode prev=null;
        ListNode curr_node=head;
        while(m>1)
        {
            prev=curr_node;
            curr_node=curr_node.next;                   // catching the connection link
            m--; 
            n--;
        }
          ListNode connection=prev;
          ListNode tail=curr_node;
           prev=null;
        while(n> 0){
            ListNode next_node=curr_node.next;
            curr_node.next=prev;                       // reversing linkedlist
            prev=curr_node;
            curr_node=next_node;
            n--;;
        }
        if(connection!=null){
            connection.next=prev;                     // connecting left with reversed linkedlist
        }
        else{
            head=prev;
        }
        tail.next=curr_node;                         // Finally attaching the tailnode
        return head;  
    }
}