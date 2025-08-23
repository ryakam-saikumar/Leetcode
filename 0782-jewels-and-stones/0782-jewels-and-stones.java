class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            mp.put(stones.charAt(i),mp.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            if(mp.containsKey(jewels.charAt(i))){
                count+=mp.get(jewels.charAt(i));
            }
        }
        return count;
    }
}