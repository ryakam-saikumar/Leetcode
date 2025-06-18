class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] pre=new int[n+1];
        int[] suff=new int[n+1];
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                pre[i]=pre[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                suff[i]=suff[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=Math.max(pre[i],suff[i]);
        }
        return sum+n;
    }
}