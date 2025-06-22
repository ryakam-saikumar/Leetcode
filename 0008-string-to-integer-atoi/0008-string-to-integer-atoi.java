class Solution {
    public int myAtoi(String s) {
        int n=s.length();
       String str = s.trim();
       int i=0;
       int sign=1;
       if(str.length()==0) return 0;
       if(str.charAt(i)=='-'){
        sign=-1;
        i++;
       }else if(str.charAt(i)=='+'){
        sign=1;
        i++;
       }
        
        int res=0;
        while(i<str.length()&&Character.isDigit(str.charAt(i))){
        int m=str.charAt(i)-'0';
    if(res>(Integer.MAX_VALUE-m)/10){
        return (sign==-1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
    }
    res=res*10+m;
    i++;
        }
        return res*sign;
    }
}