class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     Arrays.sort(nums);
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if(nums[i]<min){
            min=nums[i];
        }
     }
     List<Integer> l=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        l.add(nums[i]);
     }
     List<Integer> res=new ArrayList<>();
     for(int i=min;i<=max;i++){
        if(!l.contains(i)){
            res.add(i);
        }
     }   
     return res;
    }
}