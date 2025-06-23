class Solution {
    int start=0,max=0;
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2) return s;
        for(int i=0;i<n-1;i++){
            substring(s,i,i);
            substring(s,i,i+1);
           
        }
 return s.substring(start,start+max);
    }
    public void substring(String s,int j,int k){
        while(j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(max<k-j-1){
            max=k-j-1;
            start=j+1;
        }
    }
}