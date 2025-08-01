class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int m=pq.remove();
            int n=pq.remove();
            if(m!=n){
                pq.add(m-n);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }
}