class Solution {
    public int compareVersion(String v1, String v2){
        int m=v1.length();
        int n=v2.length();
        int idx1=0;
        int idx2=0;
        
        while(idx1<m||idx2<n){
            int num1=0;
            while(idx1<m&&v1.charAt(idx1)!='.'){
                num1=num1*10+(v1.charAt(idx1)-'0');
                idx1++;
            }
            idx1++;
            int num2=0;
            while(idx2<n&&v2.charAt(idx2)!='.'){
                num2=num2*10+(v2.charAt(idx2)-'0');
                idx2++;
            }
            idx2++;
        if(num1>num2){
            return 1;
        }
        if(num1<num2) return -1;
        }
        return 0;
    }
}