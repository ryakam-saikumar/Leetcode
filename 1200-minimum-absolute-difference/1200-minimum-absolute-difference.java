class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            List<Integer> r=new ArrayList<>();
           int ans=Math.abs(arr[i-1]-arr[i]);
           if(ans<min){
             min=ans;
            l.clear();
           
            r.add(arr[i-1]);
            r.add(arr[i]);
            l.add(r);
           }else if(min==ans){
            r.add(arr[i-1]);
            r.add(arr[i]);
            l.add(r);
           }
        }
        return l;
    }
    
}