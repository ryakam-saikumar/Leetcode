class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(n==1&&digits[0]==9){
            int i=1;
            int j=0;
            return new int[] {i,j};
        }
        if(digits[n-1]!=9){
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
        for(int j=n-1;j>=0;j--){
            if(digits[j]==9){
                digits[j]=0;
            }else{
                digits[j]=digits[j]+1;
                return digits;
            }
        }
        int[] ans=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9){
                ans[i]=0;
            }
        }
        ans[0]=1;
        return ans;
        

    }
}