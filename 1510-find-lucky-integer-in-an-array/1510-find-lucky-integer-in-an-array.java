class Solution {
    public int findLucky(int[] arr) {
        int[] a=new int[501];
        int n=arr.length;
        for(int i=0;i<n;i++){
            a[arr[i]]++;
        }
        int c=-1;
        for(int i=1;i<501;i++){
            if(i==a[i]){
                c=Math.max(c,i);
            }
        }
        return c;
    }
}