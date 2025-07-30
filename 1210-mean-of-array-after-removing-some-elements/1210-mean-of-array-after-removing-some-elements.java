class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int r=(int) (arr.length*0.05);

        int sum=0;
        for(int i=r;i<arr.length-r;i++){
            sum+=arr[i];
        }
       
        return sum/(arr.length-r*2.0);
    }
}