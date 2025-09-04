class Solution {
    public int findClosest(int x, int y, int z) {
        int f=Math.abs(x-z);
        int s=Math.abs(y-z);
        if(f==s) return 0;
        
        return f>s?2:1;
    }
}