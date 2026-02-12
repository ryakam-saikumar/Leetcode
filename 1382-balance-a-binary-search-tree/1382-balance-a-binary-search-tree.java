/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        helper(l,root);
        Collections.sort(l);
      return sortedorder(l,0,l.size()-1);
    }
    public void helper(List<Integer> l,TreeNode root){
        if(root==null){
            return;
        }
        l.add(root.val);
        helper(l,root.left);
        helper(l,root.right);
    }
    public TreeNode sortedorder(List<Integer> l,int start,int end){
        if(start>end) return null;
       
        int mid=start+(end-start)/2;
        TreeNode node =new TreeNode(l.get(mid));
        node.left=sortedorder(l,start,mid-1);
        node.right=sortedorder(l,mid+1,end);
        return node;

    }
}