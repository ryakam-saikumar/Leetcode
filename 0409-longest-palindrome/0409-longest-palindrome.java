class Solution {
    public int longestPalindrome(String s) {
       int[] a=new int[128];
       int count=0,flag=1;
       for(char ch:s.toCharArray()){
        a[ch]++;
       }
       for(int i=0;i<128;i++){
        if(a[i]!=0&&a[i]%2==0){
            count+=a[i];
        }else if(a[i]!=0){
            count+=a[i]-1;
            flag=0;
        }
       }
       if(flag==0)
        count++;
       
       return count;
    }
}