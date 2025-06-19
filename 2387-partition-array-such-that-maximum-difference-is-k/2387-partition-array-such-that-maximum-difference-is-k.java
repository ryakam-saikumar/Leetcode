class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        int min=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-min>k){
                c++;
                min=nums[i];
            }
        }
        return c;
    }
}