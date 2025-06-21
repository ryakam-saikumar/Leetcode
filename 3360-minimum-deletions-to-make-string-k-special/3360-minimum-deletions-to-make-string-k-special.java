class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int res=Integer.MAX_VALUE;
        int dt=0;
        for(int i=0;i<26;i++){
            int minfreq=freq[i];
            int temp=dt;
            for(int j=25;j>i;j--){
                if(Math.abs(freq[j]-freq[i])<=k) break;
                temp+=freq[j]-minfreq-k;
            }
            res=Math.min(res,temp);
            dt+=minfreq;
        }
    return res;
    }
}