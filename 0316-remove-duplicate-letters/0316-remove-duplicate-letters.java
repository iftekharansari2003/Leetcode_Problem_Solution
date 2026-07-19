class Solution {
    public String removeDuplicateLetters(String s) {
        boolean isVisited[]= new boolean[26];
        int lastidx[] =new int[26];

        for(int i=0;i<s.length();i++){
            lastidx[s.charAt(i)-'a']=i;
        }

        Stack<Character> st =new Stack<>();

        st.push(s.charAt(0));
        isVisited[s.charAt(0)-'a']=true;

        for(int i=1;i<s.length();i++){
            if(!isVisited[s.charAt(i)-'a']){
                while(!st.isEmpty() && (st.peek()-'a'>s.charAt(i)-'a') && lastidx[st.peek()-'a']>i){
                    isVisited[st.pop()-'a']=false;
                }
                st.push(s.charAt(i));
                isVisited[s.charAt(i)-'a']=true;
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}