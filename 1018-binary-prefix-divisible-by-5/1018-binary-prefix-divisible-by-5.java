class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=(c*2+nums[i])%5;
            l.add(c==0);
        }
        return l;
    }
}