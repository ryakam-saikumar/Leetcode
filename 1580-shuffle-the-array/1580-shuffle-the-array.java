class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[2*n];
        int p1=0,p2=n;
        int idx=0;
        while(p1<n&&p2<((2*n))){
            a[idx++]=nums[ p1++];
            a[idx++]=nums[ p2++];
        }
        return a;
    }
}