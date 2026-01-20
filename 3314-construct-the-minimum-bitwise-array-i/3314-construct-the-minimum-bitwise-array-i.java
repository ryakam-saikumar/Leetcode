class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int org=nums.get(i);
            int an=-1;
            for(int j=1;j<org;j++){
                if((j|(j+1))==org){
                    an=j;
                    break;
                }
            }
            ans[i]=an;
        }
        return ans;
    }
}