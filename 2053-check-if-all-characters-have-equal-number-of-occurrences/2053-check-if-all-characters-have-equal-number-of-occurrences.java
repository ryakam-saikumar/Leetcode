class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] c=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        Arrays.sort(c);
        int k=c[25];
        for(int i=24;i>=0;i--){
            if(c[i]>0&&c[i]!=k) return false;  
        }
        return true;
    }
}