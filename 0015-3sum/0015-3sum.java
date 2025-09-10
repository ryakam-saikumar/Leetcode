class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> res=new HashSet<>();
       
        for(int i=0;i<n;i++){ 
            int l=i+1;
            int r=n-1;
            while(l<r){
                List<Integer> lt=new ArrayList<>();
                if(nums[i]+nums[l]+nums[r]==0){
                    lt.add(nums[i]);
                    lt.add(nums[l]);
                    lt.add(nums[r]);
                    res.add(lt);
                    l++;
                    r--;
                }else if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }else{
                    l++;
                }
            }
            
        }
        return new ArrayList<>(res);
    }
}