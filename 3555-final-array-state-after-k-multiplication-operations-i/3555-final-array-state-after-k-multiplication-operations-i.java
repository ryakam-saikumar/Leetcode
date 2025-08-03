class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        while(k>0){
            int n=pq.poll();
            for(int i=0;i<nums.length;i++){
                if(nums[i]==n){
                    nums[i]*=m;
                    pq.offer(nums[i]);
                    k--;
                    break;
                }
            }
        }
        return nums;

    }
}