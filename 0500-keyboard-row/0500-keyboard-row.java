class Solution {
    public String[] findWords(String[] words) {
        List<String> l=new ArrayList<>();
        String str1="qwertyuiopQWERTYUIOP";
        String str2="asdfghjklASDFGHJKL";
        String str3="zxcvbnmZXCVBNM";
        for(int i=0;i<words.length;i++){
            String str=words[i];
           boolean inRow1 = true, inRow2 = true, inRow3 = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (str1.indexOf(ch) == -1) inRow1 = false;
                if (str2.indexOf(ch) == -1) inRow2 = false;
                if (str3.indexOf(ch) == -1) inRow3 = false;
            }

            if (inRow1 || inRow2 || inRow3) {
                l.add(str);
            }
        }
        String[] s=new String[l.size()];
        for(int i=0;i<l.size();i++){
            s[i]=l.get(i);
        }
        return s;
    }
}