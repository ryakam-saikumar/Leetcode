class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int p1=0;
        int p2=nums.length-1;
        while(p1<p2){
            if(nums[p1]+nums[p2]>ans){
                ans=nums[p1]+nums[p2];
            }
            p1++;
                p2--;
        }
        return ans;
    }
}