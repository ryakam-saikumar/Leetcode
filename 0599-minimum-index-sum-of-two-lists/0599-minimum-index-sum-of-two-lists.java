class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
         Map<String,Integer> mp=new HashMap<>(); 
        for(int i=0;i<l1.length;i++){
            mp.put(l1[i],i);
        }
        int min=Integer.MAX_VALUE;
       List<String> res=new ArrayList<>();
        for(int i=0;i<l2.length;i++){
            if(mp.containsKey(l2[i])){
                int j=mp.get(l2[i]);
                int sum=i+j;
                if(sum<min){
                    res.clear();
                    res.add(l2[i]);
                    min=sum;
                }
                else if(sum==min){
                    res.add(l2[i]);
                    min=sum;
                }
            }
        }

           return res.toArray(new String[0]); 
        
    }
}