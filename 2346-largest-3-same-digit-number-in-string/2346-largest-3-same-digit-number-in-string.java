class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        //String s="";
        for(int i=0;i<num.length()-2;i++){
            String curr=num.substring(i,i+3);
                if(curr.charAt(0)==curr.charAt(1)&&curr.charAt(1)==curr.charAt(2)){
                    if(str.isEmpty()||curr.charAt(0)>str.charAt(0))
                    {
                        str=curr;
                    }
                    
                }
    
                
            }
        return str;
    }
}