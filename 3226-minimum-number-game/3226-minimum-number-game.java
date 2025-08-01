class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        int k=0;
        while(!pq.isEmpty()){
            int a=pq.remove();
            int b=pq.remove();
            nums[k++]=b;
            nums[k++]=a;
        }
        return nums;
    }
}