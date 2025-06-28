class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[k];
        TreeSet<Integer> s=new TreeSet<>();
        for(int i=0;i<n;i++){
            if(s.size()<k){
                int idx=0;
                int max=Integer.MIN_VALUE;
                for(int j=0;j<n;j++){
                    if(!s.contains(j)&&nums[j]>max){
                        max=nums[j];
                        idx=j;
                    }
                }
                s.add(idx);
            }
        }
        int idx=0;
        for(int i:s){
            ans[idx++]=nums[i];
        }
        return ans;
    }
}