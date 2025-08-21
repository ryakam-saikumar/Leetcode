class Solution {
    public int distanceBetweenBusStops(int[] d, int s, int e) {
      if(s>e){
        int tem=s;
        s=e;
        e=tem;
      }
       int total=0,clock=0;
       for(int i=0;i<d.length;i++){
        total+=d[i];
        if(i>=s&&i<e){
            clock+=d[i];
        }
       }
       int coumter=total-clock;
            
        return Math.min(clock,coumter);
    }
}