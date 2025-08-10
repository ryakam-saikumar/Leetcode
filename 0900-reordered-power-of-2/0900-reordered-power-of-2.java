class Solution {
    String powersort(int x){
        char[] ch=String.valueOf(x).toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public boolean reorderedPowerOf2(int n) {
        if(n==1||n==2||n==4||n==16) return true;
        String digit=powersort(n);
        for(int i=0;i<31;i++){
            if(powersort(1<<i).equals(digit)) return true;
        }
        return false;
    }
}