class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int p1=0,p2=n-1;
        int area=0;
        int ans=0;
        while(p1<p2){
            area=Math.min(h[p1],h[p2])*(p2-p1);
            ans=Math.max(ans,area);
            if(h[p1]>h[p2]){
                p2--;
            }else{
                p1++;
            } 
        }
        return ans;
    }
}