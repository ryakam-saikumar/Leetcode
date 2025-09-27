class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<>();
        String str="";
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
           while(i+1<nums.length&&nums[i]+1==nums[i+1]){
            i++;
           }
           if(c!=nums[i]){
            l.add(String.valueOf(c)+"->"+String.valueOf(nums[i]));
           }else{
            l.add(String.valueOf(c));
           }
        }
        return l;
    }
}