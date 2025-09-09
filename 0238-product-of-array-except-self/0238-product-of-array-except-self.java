class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suff=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=(int) pre[i-1]*nums[i];
        }
    suff[nums.length-1]=nums[nums.length-1];
    for(int i=nums.length-2;i>=0;i--){
        suff[i]=(int) suff[i+1]*nums[i];

    }
    nums[0]=suff[1];
    nums[nums.length-1]=pre[nums.length-2];
    for(int i=1;i<nums.length-1;i++){
        nums[i]=pre[i-1]*suff[i+1];
    }
    
    return nums;
    }
}