class Solution {
    public boolean isCovered(int[][] nums, int left, int right) {
        boolean prev=true;
        for(int x=left;x<=right;x++){
            boolean curr=false;
            for(int i=0;i<nums.length;i++){
                if(x>=nums[i][0]&&x<=nums[i][1]) {
                    curr=true;
                    break;
                }
            }
            if(!curr) return false;
        }
        return true;
    }
}