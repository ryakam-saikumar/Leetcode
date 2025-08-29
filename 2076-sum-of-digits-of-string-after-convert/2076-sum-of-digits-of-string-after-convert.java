class Solution {
    public int getLucky(String s, int k) {
        String str="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            str += (s.charAt(i) - 'a' + 1); 
        }
        for(int i=0;i<str.length();i++){
            sum+=((str.charAt(i))-'0');
        }
k=k-1;
        while(k>0){
            int num=sum;
            sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            k--;
        }
        return sum;
    }
}