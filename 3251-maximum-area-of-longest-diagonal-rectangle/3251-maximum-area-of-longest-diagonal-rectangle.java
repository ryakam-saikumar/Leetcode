class Solution {
    public int areaOfMaxDiagonal(int[][] a) {
        int m=a.length;
        int mx=0;
        int ar=0;
        for(int i=0;i<m;i++){
            int l=a[i][0];
            int w=a[i][1];
            int dg=l*l+w*w;
            
            if(dg>mx){
                mx=dg;
                ar=l*w;
            }
            else if(dg==mx){
                ar=Math.max(ar,l*w);
            }
        }
        return ar;
    }
}