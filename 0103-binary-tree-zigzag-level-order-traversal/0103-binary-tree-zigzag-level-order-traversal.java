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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        
        return zzo(root,res);
    }
    public List<List<Integer>> zzo(TreeNode root,List<List<Integer>> res){
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int k=0;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            l.add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        if(k%2!=0){
            Collections.reverse(l);
            res.add(l);
            k++;
        }
        else{
            res.add(l);
            k++;
        }

        }
        return res;


    }
}