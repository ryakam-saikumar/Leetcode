class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0,q=0,r=0;
        if(nums.length<3) return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                p=i+1;
            }else{
                break;
            }
        }
        for(int i=p;i<nums.length-1;i++){
             if(nums[i]>nums[i+1]){
                q=i+1;
             }else{
                break;
             }
        }
        for(int i=q;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                r=i+1;
            }else{
                break;
            }
        }
        return p>0&&p<q&&q<r&&r==nums.length-1;
    }
}