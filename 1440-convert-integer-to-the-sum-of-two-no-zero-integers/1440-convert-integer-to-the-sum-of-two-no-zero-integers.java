class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] an=new int[2];
        int a=1;
        int b=n-a;
        while (!iszero(a) || !iszero(b)) {
            a++;
            b--;
        }
        return new int[]{a, b};
    }
    public boolean iszero(int x){
        while(x>0){
            if(x%10==0) return false;
            x=x/10;
        }
        return true;
    }
}