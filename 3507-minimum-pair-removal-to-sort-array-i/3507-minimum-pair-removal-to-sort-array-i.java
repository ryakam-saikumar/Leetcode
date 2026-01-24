class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
        }
        int c=0;
        while(!nondec(l)){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<l.size()-1;i++){
                int sum=l.get(i)+l.get(i+1);
                if(sum<min){
                    min=sum;
                    idx=i;
                }
            }
            l.set(idx,min);
            l.remove(idx+1);
            c++;
        }
        return c;
    }
    public boolean nondec(List<Integer> l){
        for(int i=1;i<l.size();i++){
            if(l.get(i)<l.get(i-1)) return false;
        }
        

        return true;
    }
}