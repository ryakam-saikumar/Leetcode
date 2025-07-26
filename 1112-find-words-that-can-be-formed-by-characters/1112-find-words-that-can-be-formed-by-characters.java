class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count=new int[26];
        for(int i=0;i<chars.length();i++){
            count[chars.charAt(i)-'a']++;
        }
        int k=0;
        int sum=0;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            int[] temp=count.clone();
            boolean canform=true;
            for(int j=0;j<str.length();j++){
                if(temp[str.charAt(j)-'a']>0){
                    temp[str.charAt(j)-'a']--;
                }
                   else{
                    canform=false;
                    break;
                   }
                }
                if(canform){
                    sum+=str.length();
                }
                
            }
            return sum;
        }
        
    
}