class Solution {
    public boolean isPalindrome(String s) {
         String str=s.replaceAll("[^a-zA-Z0-9]", "");
        str=str.toLowerCase();
        int n=str.length();
        int l=0,r=n-1;
        while(l<=r){
            if(str.charAt(l++)!=str.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}