class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,res,0,new ArrayList<>());
        return res;
    }
    public void backtrack(int[] a,int tar,List<List<Integer>> res,int idx,List<Integer> l){
        if(tar<0) return;
        else if(tar==0) res.add(new ArrayList<>(l));
        else{
            for(int i=idx;i<a.length;i++){
            l.add(a[i]);
            backtrack(a,tar-a[i],res,i,l);
            l.remove(l.size()-1);
        }
        }
        return;
    }
}