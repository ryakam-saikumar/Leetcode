class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        for(int i=heights.length-1;i>=0;i--){
            names[k]=mp.get(heights[i]);
            k++;
        }
        return names;
    }
}