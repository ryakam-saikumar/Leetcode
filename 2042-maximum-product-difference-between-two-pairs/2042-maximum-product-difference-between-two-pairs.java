class Solution {
    public int maxProductDifference(int[] nums) {
        int max=1;
        int min=1;
        int n=nums.length;
        Arrays.sort(nums);
        if(nums.length==4){
            return nums[2]*nums[3]-nums[0]*nums[1];
        }
        return nums[n-1]*nums[n-2]-nums[0]*nums[1];
    }
}