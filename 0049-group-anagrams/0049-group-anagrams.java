class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!mp.containsKey(st)){
                mp.put(st,new ArrayList<>());
            }
            mp.get(st).add(str);
        }
        return new ArrayList(mp.values());
    }
    
}