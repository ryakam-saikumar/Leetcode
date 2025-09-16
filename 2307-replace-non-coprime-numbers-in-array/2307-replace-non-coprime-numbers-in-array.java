class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> l=new ArrayList<>();
        l.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            long curr=nums[i];
            while(!l.isEmpty()){
                long last=l.get(l.size() - 1);
                long g=gcd(last,curr);
                if(g==1) break;
                long lcmval = (last/g)*curr;
                l.remove(l.size()-1);
                curr=lcmval;
            }
            l.add((int) curr);
        }
        return l;
    }
    public static long gcd(long a, long b) {
    while(b!=0){
        long t=b;
        b=a%b;
        a=t;
    }
    return a;
    }
}