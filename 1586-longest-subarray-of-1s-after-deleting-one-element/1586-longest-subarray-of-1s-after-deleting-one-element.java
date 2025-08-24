class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int c=0;
        boolean zero=false;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i]==0){
                zero=true;
                int count=0;
                int l=i-1;
                while(l>=0&&nums[l]==1){
                    count++;
                    l--;
                }
                int r=i+1;
                while(r<n&&nums[r]==1){
                    count++;
                    r++;
                }
                c=Math.max(c,count);
            }

            
        }
        return zero?c:n-1;
    }
}