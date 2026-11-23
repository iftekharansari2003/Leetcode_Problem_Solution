class Solution {
    public boolean checkString(String s) {
        boolean find_b=false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                find_b=true;
            }
            else if(s.charAt(i)=='a'&& find_b){
                return false;
            }
        }
        return true;
    }
}