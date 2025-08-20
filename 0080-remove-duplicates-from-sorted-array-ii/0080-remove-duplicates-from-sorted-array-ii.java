class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=1;int p2=1;
        int count=1;
        int k=0;
        if(nums.length<=2) return nums.length;
        while(p2<nums.length){
            if(nums[p2]==nums[p2-1]) count++;
            else{
                count=1;
            }
            if(count<=2){
                nums[p1]=nums[p2];
                p1++;
            }
            p2++;
        }
    return p1;
    }
}