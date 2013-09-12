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
        HashMap<Integer, ListNode> dup= new HashMap<Integer, ListNode>();
        ListNode cur = head;
        ListNode pre = cur;
        dup.put(cur.val, cur);
        while(cur.next != null){
            cur = cur.next;
            if(dup.containsKey(cur.val)){
                pre.next = cur.next;
                cur = pre;
            }
            else{
                dup.put(cur.val, cur);
                pre = pre.next;
            }
        }
        return head;
    }
}