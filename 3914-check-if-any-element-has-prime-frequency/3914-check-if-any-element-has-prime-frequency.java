class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(prime(mp.get(nums[i]))) return true;
        }
        return false;
    }
    public boolean prime(int m){
       int count=0;
        if(m==2||m==3) return true;
        for(int i=2;i<=m;i++){
            if(m%i==0) count++;
            
        }
        if(count==1){
            return true;
        }
    return false;
    }
}