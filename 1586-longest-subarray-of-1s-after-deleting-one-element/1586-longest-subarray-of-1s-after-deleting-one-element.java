class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int c=0;
        boolean zero=false;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i]==0){
                zero=true;
                int left=0;
                int right=0;
                int l=i-1;
                while(l>=0&&nums[l]==1){
                    right++;
                    l--;
                }
                int r=i+1;
                while(r<n&&nums[r]==1){
                    right++;
                    r++;
                }
                c=Math.max(c,left+right);
            }

            
        }
        return zero?c:n-1;
    }
}