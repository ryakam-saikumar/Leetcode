class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mp = new HashMap<>();
        Map<String, Character> m = new HashMap<>();
        String[] str = s.split(" ");
        
        if (str.length != pattern.length()) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = str[i];
            
            if (mp.containsKey(c)) {
                if (!mp.get(c).equals(w)) {
                    return false;
                }
            } else {
                mp.put(c, w);
            }
            
            if (m.containsKey(w)) {
                if (m.get(w) != c) {
                    return false;
                }
            } else {
                m.put(w, c);
            }
        }
        
        return true;
    }
}
