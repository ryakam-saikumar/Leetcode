class Solution {
    double soup(int a,int b,double[][] dp){
        if(a<=0&&b<=0) return 0.5;
        if(a<=0) return 1.0;

        if(b<=0) return 0.0;
        if(dp[a][b]!=-1.0){
            return dp[a][b];
        }
        double ans=0;
        ans+=0.25*soup(a-4,b-0,dp);
        ans+=0.25*soup(a-3,b-1,dp);
        ans+=0.25*soup(a-2,b-2,dp);
        ans+=0.25*soup(a-1,b-3,dp);
        dp[a][b]=ans;
        return ans;
    } 
    public double soupServings(int n) {
        if(n>5000) return 1.0;
        n=(int) Math.ceil(n/25.0);
        double[][] dp=new double[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1.0;
            }
        }
        return soup(n,n,dp);
    }
}