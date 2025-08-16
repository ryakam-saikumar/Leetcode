class Solution {
    public boolean halvesAreAlike(String s) {
      int n=s.length();
      int f=0;
      int se=0;
      int i=0;
      int j=n/2;
      
      while(i<n/2&&j<n){
        if(vowel(s.charAt(i))){
            f++;
        }
        if(vowel(s.charAt(j))){
            se++;
        }
        i++;
        j++;
      }
      return f==se?true:false;
    }
    boolean vowel(char ch){
        String str="aeiouAEIOU";
        if(str.indexOf(ch)!=-1){
            return true;
        }
        return false;
    }
}