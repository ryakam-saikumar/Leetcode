class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        //int p1=0;int p2=0;
        int c=0;
        boolean[] use=new boolean[n];
        Arrays.fill(use,false);
        for(int i=0;i<n;i++)
            { boolean placed=false;
            for(int j=0;j<n;j++)
                {
                    if(!use[j]&&baskets[j]>=fruits[i])
                    {
                        use[j]=true;
                        placed=true;
                        break;
                    }
                    
                }
             if(!placed)
             {
                 c++;
             }
            }
        return c;
    }
}