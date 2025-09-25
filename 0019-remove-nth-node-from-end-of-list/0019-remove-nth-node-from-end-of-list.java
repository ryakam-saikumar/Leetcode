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
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int k=0;
        Stack<Integer> st=new Stack<>();
        for(int i=l.size()-1;i>=0;i--){
            if(n-1!=k){
                st.push(l.get(i));
            }
            k++;
        }
        ListNode ll=new ListNode();
        ListNode dummy=ll;
        while(!st.isEmpty()){
            dummy.next=new ListNode(st.pop());
            dummy=dummy.next;
        }
        return ll.next;
    }
}