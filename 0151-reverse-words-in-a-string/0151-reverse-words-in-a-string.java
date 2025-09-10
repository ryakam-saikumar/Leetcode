class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        int n=str.length;
        String st1="";
        for(int i=n-1;i>=0;i--){
            st1+=str[i]+" ";
        }
        return st1.trim();
    }
}