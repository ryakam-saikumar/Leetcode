class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str=s1.split(" ");
        String[] str2=s2.split(" ");
        Map<String,Integer> mp=new HashMap<>();
        for(String st:str){
            mp.put(st,mp.getOrDefault(st,0)+1);
        }
        for(String st:str2){
            mp.put(st,mp.getOrDefault(st,0)+1);
        }
        List<String> l=new ArrayList<>();

     for(Map.Entry<String,Integer> en:mp.entrySet())   {
        if(en.getValue()==1){
            l.add(en.getKey());
        }
     }
     return l.toArray(new String[0]);
    }
}