class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=0,diff=0,ans=0;
        while(r<nums.length){
            diff=nums[r]-nums[l];
            if(diff==1){
                ans=Math.max(ans,r-l+1);
            }if(diff<=1){
                r++;
            }else{
                l++;
            }
        }
        return ans;
    }
}