class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i-prev+1);
                sum-=nums[prev++];
            }
          
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}