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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode dummy=head;
        while(dummy!=null){
            s.push(dummy.val);
            dummy=dummy.next;
        }
        int carry=0;
        ListNode nhead=null;
        while(!s.isEmpty()){
            int val=s.pop()*2+carry;
            carry=val/10;
            val=val%10;
            nhead=new ListNode(val,nhead);
        }
        if(carry>0){
             nhead=new ListNode(carry,nhead);
        }
        return nhead;
    }
}