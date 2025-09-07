class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0&&n==1){
        nums1[0]=nums2[0];
        } 
        if(m==1&&n==0){
            return;
        }
        int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);
        return;
    }
}