class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>(mp.keySet());
        Collections.sort(l,(a,b)->{
            if(mp.get(a)!=mp.get(b)){
                return mp.get(a)-mp.get(b);
            }
            return b-a;
        });
        int idx=0;
        for(int i:l){
            int fre=mp.get(i);
            for(int j=0;j<fre;j++){
                nums[idx++]=i;
            }
        }
       return nums;
    }
}