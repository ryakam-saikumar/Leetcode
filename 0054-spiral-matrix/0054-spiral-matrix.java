class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dir=0,top=0,left=0,right=n-1,down=m-1;
        List<Integer> res=new ArrayList<>();
        while(top<=down&&left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top+=1;
            }
            else if(dir==1){
                for(int i=top;i<=down;i++){
                    res.add(matrix[i][right]);
                }
                right-=1;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    res.add(matrix[down][i]);
                }
                down-=1;
            }
            else if(dir==3){
                for(int i=down;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left+=1;
            }
            dir=(dir+1)%4;
            
        }
    return res;
    }
}