class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int idx=0;
        for(int key:mp.keySet()){
            int count=Math.min(mp.get(key),2);
            for(int j=0;j<count;j++){
                nums[idx++]=key;
            }
        }
        return idx;
    }
}