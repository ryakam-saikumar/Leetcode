class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;
        for(int i:nums){
            if(i==0){
                count++;
            }else{
                 pq.add(i);
            }
           
        }
        int operation =0;
        while(!pq.isEmpty()&&count!=nums.length){
            int m=pq.remove();
            pq.clear();
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                nums[i]=nums[i]-m;
                if(nums[i]==0){
                    count++;
                }else{
                    pq.add(nums[i]);
                }
                
            }
            }
operation++;
        }
        return operation;
    }
}