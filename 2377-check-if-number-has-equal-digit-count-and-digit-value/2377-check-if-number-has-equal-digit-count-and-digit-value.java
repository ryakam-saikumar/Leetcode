class Solution {
    public boolean digitCount(String num) {
        int[] n=new int[11];
        for(int i=0;i<num.length();i++){
           n[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(n[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;

    }
}