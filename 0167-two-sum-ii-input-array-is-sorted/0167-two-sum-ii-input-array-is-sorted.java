class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int p1=0;
        int p2=nums.length-1;
        while(p1<p2){
            if(nums[p1]+nums[p2]==target){
                ans[0]=p1+1;
                ans[1]=p2+1;
                break;
            }else if(nums[p1]+nums[p2]<target){
                p1++;
            }else{
                p2--;
            }
        }
        return ans;
    }
}