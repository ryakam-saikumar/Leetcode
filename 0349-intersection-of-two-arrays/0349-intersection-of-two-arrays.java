class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> l=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(s.contains(nums2[j])){
                l.add(nums2[j]);
            }
        }
        int idx=0;
        int[] a=new int[l.size()];
        for(int i:l){
            a[idx++]=i;
        }
        return a;
    }
}