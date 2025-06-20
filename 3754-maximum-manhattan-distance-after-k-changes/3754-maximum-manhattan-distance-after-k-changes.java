class Solution {
    public int maxDistance(String s, int k) {
        int m=s.length();
        int e=0,w=0,S=0,n=0;
        int ans=0;
        for(int i=0;i<m;i++){
            if(s.charAt(i)=='E') e++;
            else if(s.charAt(i)=='W') w++;
            else if(s.charAt(i)=='S') S++;
            else n++;
            ans=Math.max(ans,Math.min(Math.abs(n-S)+Math.abs(e-w)+2*k,i+1));
        }
        return ans;
    }
}