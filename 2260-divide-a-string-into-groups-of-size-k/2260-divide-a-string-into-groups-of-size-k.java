class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        String[] st=new String[(n+k-1)/k];
        int l=0;
        for(int i=0;i<n;i+=k){
            String str="";
            for(int j=0;j<k;j++){
                
                if(i+j<n){
                   str+=s.charAt(i+j);
                }else{
                    str+=fill;
                }
            }
            st[l++]=str;
        }
        
        return st;
    }
}