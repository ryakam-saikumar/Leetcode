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
    Map<Integer,Map<Integer,List<Integer>>> mp = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        helper(root,0,0);
        List<List<Integer>> lst= new ArrayList<>();
        for(int row:mp.keySet()){
            List<Integer> temp= new ArrayList<>();
            for(int k:mp.get(row).keySet()){
                List<Integer> t= new ArrayList<>(mp.get(row).get(k));
                Collections.sort(t);
                temp.addAll(t);
            }
            lst.add(temp);
        }
        return lst;
    }
    public void helper(TreeNode root,int row,int col){
        if(root==null) return;
        mp.putIfAbsent(row,new TreeMap<>());
        mp.get(row).putIfAbsent(col,new ArrayList<>());
        mp.get(row).get(col).add(root.val);
        helper(root.left,row-1,col+1);
        helper(root.right,row+1,col+1);
    }
}