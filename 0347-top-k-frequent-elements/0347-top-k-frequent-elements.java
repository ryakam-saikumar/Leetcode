class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] c=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
      Queue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(mp.get(b), mp.get(a)));

        for(int key:mp.keySet()){
            pq.add(key);
        }
        for(int i=0;i<k;i++){
            c[i]=pq.poll();
        }
        return c;
    }
}