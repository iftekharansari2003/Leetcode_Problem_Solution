class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.add(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        System.out.print("Count="+count+","+"size="+st.size());
        return count+st.size();
    }
}