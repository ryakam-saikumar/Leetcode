class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int n=0;
        boolean v=false;
        boolean c=false;
        int ss=0;
        String str1="$@#";
        String str2="aeiouAEIOU";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(str1.indexOf(ch)!=-1){
              return false;
            }
            if(Character.isLetter(ch)){
                if(str2.indexOf(ch)!=-1){
               v=true;
            }
            else {
                c=true;
            }
            }
             
        }
        return v&&c;
    }
}