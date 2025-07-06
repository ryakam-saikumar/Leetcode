class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> s=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isDigit(ch)){
                str.append(ch);
            }else{
                if(str.length()>0){
                    String num=str.toString().replaceAll("^0+","");
                    if(num.equals("")) num="0";
                    s.add(num);
                    str.setLength(0);
                }
                          
            }
        }
        if(str.length()>0){
                    String num=str.toString().replaceAll("^0+","");
                    if(num.equals("")) num="0";
                    s.add(num);
                    
                }
        return s.size();
    }
}