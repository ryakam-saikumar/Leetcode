class Solution {
    public int thirdMax(int[] nums) {
        Long f=null;
        Long s=null;
        Long t=null;
        for(int i=0;i<nums.length;i++){
            long n=nums[i];
            if((f!=null&&f==n)||(s!=null&&s==n)||(t!=null&&t==n)) continue;
            if(f==null||nums[i]>f){
                t=s;
                s=f;
                f=n;
            }
            else if(s==null||n>s){
                t=s;
                s=n;
            }
            else if(t==null||n>t){
                t=n;
            }
        }

        return t==null?f.intValue():t.intValue();
    }
}