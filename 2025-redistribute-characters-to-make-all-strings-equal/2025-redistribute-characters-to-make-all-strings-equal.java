class Solution {
    public boolean makeEqual(String[] words) {
        int[] count=new int[26];
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                count[s.charAt(j)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]%words.length!=0){
                return false;
            }
        }
        return true;
    }
}