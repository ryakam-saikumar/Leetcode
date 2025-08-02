class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        
            int r=pq.poll();
            int s=pq.poll();
    return (r-1)*(s-1);
       
    }
}