class Solution {
    int[] segment;
    void build(int[] arr,int i,int l,int r){
        if(l==r){
            segment[i]=arr[l];
            return;
        }
        int mid=(l+r)/2;
        build(arr,2*i+1,l,mid);
        build(arr,2*i+2,mid+1,r);
        segment[i]=Math.max(segment[2*i+1],segment[2*i+2]);

    }
    boolean query(int i,int l,int r,int val){
        if(segment[i]<val) return false;
        if(l==r){
            segment[i]=-1;
            return true;
        }
        int mid=(l+r)/2;
        boolean placed=false;
        if(segment[2*i+1] >= val) {
    placed = query(2*i+1, l, mid, val);
} else {
    placed = query(2*i+2, mid+1, r, val);
}

        segment[i]=Math.max(segment[2*i+1],segment[2*i+2]);
        return placed;
    }
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        segment=new int[4*n];
        Arrays.fill(segment,-1);
        build(baskets,0,0,n-1);
        int ans=0;
        for(int i:fruits){
            if(query(0,0,n-1,i)==false) ans++;
        }
        return ans;

    }
}