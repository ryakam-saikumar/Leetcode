class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");
        String[] str1=str.split(" ");
        Set<String> s=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            s.add(banned[i].toLowerCase());
        }
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<str1.length;i++){
            String str2=str1[i].trim();
            if(str2.length()==0||s.contains(str2)) continue;                
            mp.put(str2,mp.getOrDefault(str2,0)+1);
            
            
        }
        String common="";
        int max=0;
        for(String word:mp.keySet()){
            int freq=mp.get(word);
            if(freq>max){
                max=freq;
                common=word;
            }

            }
             return common;
        }
       
    
}