class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);
        
        int i=0;
        int j=0;
        String s1=strs[0];
        String sn=strs[strs.length-1];
        String s="";
        while(i<s1.length()&&j<sn.length()&&s1.charAt(i)==sn.charAt(j)){
            s=s+s1.charAt(i);
            i++;
            j++;
        }  
        return s;  
        }
}