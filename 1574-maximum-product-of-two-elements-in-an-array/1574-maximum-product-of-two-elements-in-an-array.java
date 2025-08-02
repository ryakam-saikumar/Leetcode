class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int m=nums[i]-1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int n=nums[j]-1;
                int prod=m*n;
                max=Math.max(prod,max);
                }
                
            }
        }
        return max;
    }
}