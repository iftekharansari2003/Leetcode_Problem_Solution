class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String sc=s+s;
        int idx=sc.indexOf(goal);
        if(idx==-1){
            return false;
        }
        return true;
    }
}