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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> l=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            l.add(curr.val);
            curr=curr.next;
        }
        Stack<Integer> s=new Stack<>();
        int k=0;
        for(int i=l.size()-1;i>=0;i--){
            k++;
            if(n!=k){
                s.push(l.get(i));
            }
        }
        ListNode ll=new ListNode();
        ListNode hh=ll;
        while(!s.isEmpty()){
            hh.next=new ListNode(s.pop());
            hh=hh.next;
        }
        return ll.next;
    }
}