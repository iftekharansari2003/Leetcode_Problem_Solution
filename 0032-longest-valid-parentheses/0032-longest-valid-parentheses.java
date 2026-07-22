class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();

        st.push(-1);
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);

            if(curr=='('){
                st.push(i);
            }else{
                if(st.peek()!=-1 && s.charAt(st.peek())=='('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        while(!st.isEmpty()){
            arr.add(st.pop());
        }
        Collections.reverse(arr);
    arr.add(s.length());
        int max=0;
        for(int i=0;i<arr.size()-1;i++){
            max=Math.max((arr.get(i+1)-arr.get(i)-1),max);
        }
        return max;
    }
}