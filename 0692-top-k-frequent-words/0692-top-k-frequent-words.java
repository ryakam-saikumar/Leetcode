class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String ,Integer> mp=new HashMap<>();
        for(int i=0;i<words.length;i++){
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }
        List<String> s=new ArrayList<>(mp.keySet());
        s.sort((a,b)->{
            int comp=mp.get(b)-mp.get(a);
            if(comp==0){
                return a.compareTo(b);
            }
            return comp;
        });
        List<String> l=new ArrayList<>();
        for(int i=0;i<k;i++){
            l.add(s.get(i));
        }
       return l;
    }
}