class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                if(nums[i]>=0){
                    sum+=nums[i];
                }
                
            }
        }
        int ans=Integer.MIN_VALUE;
        if(sum==0){
            for(int i=0;i<nums.length;i++){
                ans=Math.max(ans,nums[i]);
            }
        }
        
        return sum==0?ans:sum;
    }
}