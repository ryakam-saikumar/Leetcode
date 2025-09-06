class Solution {
    public int findFinalValue(int[] nums, int o) {
        int n=nums.length;
       Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        while(s.contains(o)){
            o=2*o;
        }
        return o;
    }
}