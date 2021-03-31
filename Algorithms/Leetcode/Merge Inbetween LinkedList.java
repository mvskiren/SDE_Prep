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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list2==null) return list1;
        ListNode curr1=list1;
        ListNode curr2=list1;
        ListNode curr_2=list2;
        ListNode prev1=list1;
        ListNode prev2=list1;
        while(a>0){ 
            prev1=curr1;
            curr1=curr1.next;
            a--;
            b--;
        }
        ListNode connection=prev1;
        curr2=curr1;
         while(b>0){
             curr2=curr2.next;
            b--;
         }
        ListNode tail=curr2.next;
         while(curr_2.next!=null) curr_2=curr_2.next;
         connection.next=list2;
         curr_2.next=tail;
         return list1;   
    }
}