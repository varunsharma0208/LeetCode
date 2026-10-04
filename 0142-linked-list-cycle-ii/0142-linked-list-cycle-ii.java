/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hash=new HashSet<>();
        ListNode current=head;
        while(current!=null)
        {
            if(hash.contains(current))
            {
                return current;
            }
            else
            {
                hash.add(current);
                current=current.next;
            }
        }
        return null;
    }
}