class Solution {
    public int maxPower(String s) {
        int[] ans=new int[26];
        char prev=s.charAt(0);
        int c=1;
        int m=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            if(prev==s.charAt(i)){
                c++;
            }
            else{
                m=Math.max(c,m);
                c=1;
            }
            prev=s.charAt(i);
        }
        m = Math.max(m, c);

        return m;
    }
}