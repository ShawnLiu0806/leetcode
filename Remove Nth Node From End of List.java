/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode curr = head;
        int i = 0;
        while(curr.next != null && i < n){
            curr = curr.next;
            i++;
        }
        if(i == (n-1)){
            return head.next;
        }
        else if(i < (n-1)){
            return head;
        }
        else{
            while(curr.next != null){
                pre = pre.next;
                curr = curr.next;
            }
            pre.next = pre.next.next;
        }
        return head;
    }
}