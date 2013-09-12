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
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode cur = fakeHead.next;
        while(cur != null){
            if(pre.val != cur.val && (cur.next == null || cur.val != cur.next.val)){
                if(pre.next == cur){
                    pre = pre.next;
                }
                else{
                    pre.next = cur.next;
                }
            }
            cur = cur.next;
        }
        return fakeHead.next;
    }
}