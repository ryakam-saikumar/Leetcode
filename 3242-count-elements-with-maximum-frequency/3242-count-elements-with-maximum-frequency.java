class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)>m){
                m=Math.max(m,mp.get(i));
            }
        }
        int ans=0;
        for(int i:mp.keySet()){
            if(mp.get(i)==m){
                ans+=m;
            }
        }
        return ans;
    }
}