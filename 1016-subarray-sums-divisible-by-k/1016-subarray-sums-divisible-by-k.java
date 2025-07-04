class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int c=0;

        if(n==1) return nums[0]%k==0?1:0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        for(int i:nums){
            sum+=i;
            int mod=sum%k;
            if(mod<0) mod+=k;
            if(mp.containsKey(mod)) c+=mp.get(mod);
            mp.put(mod,mp.getOrDefault(mod,0)+1);
        }
    return c;
    }
}