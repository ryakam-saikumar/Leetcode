class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        int c=1;
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<3){
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}