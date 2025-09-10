class Solution {
    public int removeElement(int[] nums, int val) {
      //Arrays.sort(nums);
        int i,count=0,k=0;
        for(i=0;i<nums.length;i++)
        {
                if(nums[i]!=val)
                {
                nums[k]=nums[i];
                    k++;
                }
        }
        return k;
    }
}