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
        ListNode dummy=new ListNode(0);
        ListNode node=head;
        ListNode temp=dummy;
        Stack<Integer> st=new Stack<>();
        int c=0;
        while(node!=null){
            c++;
            if (c >= left && c <= right) {
                st.push(node.val);
            }else if(c>right){
                break;
            }
            else{
                dummy.next=new ListNode(node.val);
                dummy=dummy.next;
            }
            node=node.next;
        }
        while(!st.isEmpty()){
            dummy.next=new  ListNode(st.pop());
            dummy=dummy.next;
        }while(node!=null){
            dummy.next=new  ListNode(node.val);
            dummy=dummy.next;
            node=node.next;
        }
        return temp.next;
    }
}