class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[t.length];
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty()&&t[i]>t[st.peek()]){
                int prev=st.pop();
                res[prev]=i-prev;
                
            }
            st.push(i);
        }
        return res;
    }
}