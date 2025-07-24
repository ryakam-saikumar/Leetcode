class Solution {
    public int secondHighest(String s) {
        int f=-1;
        int se=-1;
        for(int i=0;i<s.length();i++){
           
            if(Character.isDigit(s.charAt(i))){
                 int n=s.charAt(i)-'0';
               if(n>f){
                se=f;
                f=n;
               }
               else if(n!=f&&n>se){
                se=n;
               }
            }
        }
        return se;
    }
}