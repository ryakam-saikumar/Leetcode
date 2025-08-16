class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        int[] a=new int[str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==6){
                a[i]=9;
                break;
            }
        }
        int res=0;
        for(int i:a){
            res=res*10+i;
        }
        return res;
    }
}