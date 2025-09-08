class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i:mp.keySet()){
            if(mp.get(i)>n/2){
                max=i;
            }
        }
        return max;
    }
}