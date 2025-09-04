class Solution {
    public int findClosest(int x, int y, int z) {
        int min=Math.abs(x-z);
        int max=Math.abs(y-z);
        if(min==max) return 0;
        
        return max>min?1:2;
    }
}