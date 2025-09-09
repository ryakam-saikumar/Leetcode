class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        int n=nums.length;
       k=k%n;
        int idx=0;
        for(int i=n-k;i<nums.length;i++){
            ans[idx++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[idx++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        return;
    }
}