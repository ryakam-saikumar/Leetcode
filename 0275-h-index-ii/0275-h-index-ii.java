class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=n-mid){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return n-l;
    }
}