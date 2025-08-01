class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<score.length;i++){
            pq.offer(new Pair<>(i,score[i]));
        }
        String[] str=new String[score.length];
        int p=1;
        while(!pq.isEmpty()){
            if(p==1){
                str[pq.peek().getKey()]="Gold Medal";
            }
           else if(p==2){
                str[pq.peek().getKey()]="Silver Medal";
            }
            else if(p==3){
                str[pq.peek().getKey()]="Bronze Medal";
            }else{
                str[pq.peek().getKey()]=String.valueOf(p);
            }
            pq.remove();
            p++;
        }
        return str;
    }
}