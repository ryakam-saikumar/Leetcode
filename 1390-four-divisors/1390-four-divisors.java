class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int ts=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int sum=0;
           for(int j=1;j*j<=nums[i];j++){
            if(nums[i]%j==0){
                int d1=j;
                int d2=nums[i]/d1;
                if(d1==d2){
                    c+=1;
                    sum+=d1;
                }else{
                    c+=2;
                    sum+=d1+d2;
                }
                if(c>4) break;
            }
           }
           if(c==4) ts+=sum;
        }
        return ts;
    }
}