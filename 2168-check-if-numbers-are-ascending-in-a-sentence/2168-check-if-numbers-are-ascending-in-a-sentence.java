class Solution {
    public boolean areNumbersAscending(String s) {
        int n=s.length();
        int prev=-1;
        for(String str:s.split(" ")){
            if(Character.isDigit(str.charAt(0))){
                int m=Integer.parseInt(str);
                if(prev>=m){
                    return false;
                }
                prev=m;
            }
        }
        return true;
    }
}