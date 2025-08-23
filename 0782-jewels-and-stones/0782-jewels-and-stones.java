class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] ch=jewels.toCharArray();
        char[] ch1=stones.toCharArray();
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(ch[i]==ch1[j]){
                    count++;
                }
            }
        }
        return count;
    }
}