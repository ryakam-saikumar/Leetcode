class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> l=new ArrayList<>();
        l.add(1);
        result.add(l);
        if(numRows==1) return result;
        for(int i=1;i<numRows;i++){
            List<Integer> prev=result.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prev.get(j)+prev.get(j+1));
            }
            row.add(1);
            result.add(row);
        } 
        return result;
    }
}