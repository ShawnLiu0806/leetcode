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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        
        while(cur != null){
            if(pre.val == cur.val){
                pre.next = cur.next;
                cur = pre.next;
            }
            else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return head;
    }
}