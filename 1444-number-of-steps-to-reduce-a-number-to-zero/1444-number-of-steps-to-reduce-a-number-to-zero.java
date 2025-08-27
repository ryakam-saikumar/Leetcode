class Solution {
    public int numberOfSteps(int num) {
        int temp=num;
        int k=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                k++;
            }
            else{
                num=num-1;
                k++;
            }
        }
        return k;
    }
}