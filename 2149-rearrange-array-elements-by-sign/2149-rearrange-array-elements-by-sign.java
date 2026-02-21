class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int p=0;
        int n=1;
        int[] a=new int[l];
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                a[p]=nums[i];
                p=p+2;
            }else{
                a[n]=nums[i];
                n=n+2;
            }
        }
        return a;
    }
}