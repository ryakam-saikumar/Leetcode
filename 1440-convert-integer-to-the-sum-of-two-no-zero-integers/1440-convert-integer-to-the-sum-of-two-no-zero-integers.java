class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] an=new int[2];
        for(int a=1;a<n;a++){
        int b=n-a;
        if(iszero(a)&&iszero(b)){
            an[0]=a;
            an[1]=b;
        return an;  
        }
        }
        
        
        return an;
    }
    public boolean iszero(int x){
        while(x>0){
            if(x%10==0) return false;
            x=x/10;
        }
        return true;
    }
}