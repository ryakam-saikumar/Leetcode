class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        List<Integer> o=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        for(int i=0;i<n;i+=2){
            e.add(nums[i]);
        }
        for(int i=1;i<n;i+=2){
            o.add(nums[i]);
        }
        Collections.sort(e);
        Collections.sort(o,Collections.reverseOrder());
        int ei=0,oi=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=e.get(ei++);
            }else{
                nums[i]=o.get(oi++);
            }
        }
        
        return nums;
    }
}