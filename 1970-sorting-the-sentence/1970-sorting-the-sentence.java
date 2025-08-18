class Solution {
    public String sortSentence(String s) {
        String[] str=new String[s.split(" ").length];
       String[] s1 = s.split(" ");
        for(int i=0;i<s1.length;i++){
            String st=s1[i];
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<st.length();j++){
                if(Character.isDigit(st.charAt(j))){
                    str[st.charAt(j)-'0'-1]=sb.toString();
                }else{
                    sb.append(st.charAt(j));
                }
            }
        }
        return String.join(" ",str);
    }
}