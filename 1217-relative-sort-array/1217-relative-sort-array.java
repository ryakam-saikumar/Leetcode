class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans=new int[1001];
        int[] ans2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            ans[arr1[i]]++;
        }
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            while(ans[arr2[i]]>0)
            {
                ans2[k]=arr2[i];
            ans[arr2[i]]--;
            k++;
            }
            
        }
        for (int i = 0; i < ans.length; i++) {
            while (ans[i] > 0) {
                ans2[k++] = i;
                ans[i]--;
            }
        }
        return ans2;

    }
}