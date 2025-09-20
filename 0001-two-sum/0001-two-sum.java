class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(mp.containsKey(sum)){
                return new int[] {i,mp.get(sum)};
            }else{
                mp.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}