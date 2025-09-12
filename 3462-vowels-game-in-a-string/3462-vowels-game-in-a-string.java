class Solution {
    public boolean doesAliceWin(String s) {
        String str="aeiou";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))!=-1){
                c++;
            }
        }
        if(c>0) return true;
        return false;
    }
}