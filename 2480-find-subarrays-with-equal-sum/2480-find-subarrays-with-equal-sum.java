class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=1;i<nums.length;i++){
            int sum=nums[i]+nums[i-1];
            
                if(s.contains(sum)){
                return true;
            }
                s.add(sum);
            }
        return false;
    }
}