class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int sum=0;
        Set<Integer> s=new HashSet<>();
        while(true){
            sum=0;
            
            while(temp>0){
                int rem=temp%10;
                sum+=(rem*rem);
                temp/=10;
            }
            if(sum==1) return true;
            else if(s.contains(sum)) return false;
                s.add(sum);
                temp=sum;
            
        }
    }
}