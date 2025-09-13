class Solution {
    public int maxFreqSum(String s) {
        String str="aeiou";
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int v=0;
        int c=0;
        for(char ch:mp.keySet()){
            if(str.indexOf(ch)!=-1){
                v=Math.max(v,mp.get(ch));
            }else{
                c=Math.max(c,mp.get(ch));
            }
        }
        return c+v;
    }
}