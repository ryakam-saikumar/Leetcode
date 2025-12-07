class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        
        int count=0;
        if(sum%2==0){
           return nums.length-1;
        }
        
        
        return count;
    }
}