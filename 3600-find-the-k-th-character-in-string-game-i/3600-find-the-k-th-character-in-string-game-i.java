class Solution {
    public char kthCharacter(int k) {
        String str="a";
        int m=0;
        while(true)
        {
            String s="";
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='z')
                {
                 s=s+"a";
                }
            
            m=str.charAt(i)+1;
            s=s+(char) m;
            }
            str=str+s;
            if(str.length()>=k)
            {
                break;
            }
        }
        return str.charAt(k-1);
        
    }
}