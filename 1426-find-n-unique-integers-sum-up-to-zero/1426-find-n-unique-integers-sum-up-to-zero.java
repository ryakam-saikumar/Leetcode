class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        if(n==1){
           a[0]=0;
           return a;
        }
        int x=n/2;
        int k=0;
        if(n%2==0){
            for(int i=-x;i<=+x;i++){
                if(i!=0){
                    a[k]=i;
            k++;
                }
            
        }
        }else{
for(int i=-x;i<=+x;i++){
                
                    a[k]=i;
            k++;
               
            
        }
        }
        
        
        return a;
    }
}