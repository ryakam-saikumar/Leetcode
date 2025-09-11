class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray();
        char[] ch=t.toCharArray();
        if(c.length!=ch.length) return false;
        Arrays.sort(c);
        Arrays.sort(ch);
        for(int i=0;i<c.length;i++){
            if(c[i]!=ch[i]) return false;
        }
        return true;
    }
}