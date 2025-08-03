class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        List<PriorityQueue<Integer>> l=new ArrayList<>();
        for(int i=0;i<m;i++){
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<n;j++){
                pq.offer(grid[i][j]);
            }
            l.add(pq);
        }
        int res=0;
        
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<l.size();j++){
                int p=l.get(j).poll();
                max=Math.max(p,max);
            }
            res+=max;
        }
        return res;
    }
}