class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod=(int) 1e9+7;
        int m=queries.length;
        int k=queries[0].length;
        List<Long> l=new ArrayList<>();
        int[] ans=new int[m];
        for(int i=0;i<31;i++){
            if(((n>>i)&1)==1){
                l.add(1L<<i);
            }
        }
            for(int i=0;i<m;i++){
                int[] querie = queries[i];
                long an=1;
                for(int j=querie[0];j<=querie[1];j++){
                    an=(an*(l.get(j)%mod))%mod;
                }
                ans[i]=(int)an;
            }
        
        return ans;
    }
}