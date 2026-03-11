class Solution {
    public int bitwiseComplement(int n) {
        String bin=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='1'){
                sb.append("0");
            }
            else{
                  sb.append("1");
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}