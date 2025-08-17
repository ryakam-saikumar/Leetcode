class Solution {
    public String modifyString(String s) {
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='?'){
                for(char ch='a';ch<='z';ch++){
                    if((i>0&&ch==c[i-1])||(i<c.length-1&&ch==c[i+1])) continue;
                 c[i]=ch;
                 break;
                }
               
            }
        }
        return new String(c);
    }
}