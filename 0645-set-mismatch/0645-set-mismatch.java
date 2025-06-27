class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] c=new int[nums.length+1];
        Arrays.sort(nums);
        int miss=-1,dup=-1;
        for(int i:nums){
           c[i]++;
            
        }
        for(int i=1;i<=nums.length;i++){
            if(c[i]==2) dup=i;
            if(c[i]==0) miss=i;
        }
        return new int[] {dup,miss};
    }
}