class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(goal.charAt(0)==s.charAt(i)){
                boolean ans=true;
                int j=i;
                int k=0;
                while(k<s.length()){
                    if(goal.charAt(k)!=s.charAt(j)){
                        ans=false;
                        break;
                    }
                    k++;
                    j=(j+1)%s.length();
                }
                if(ans){
                    return true;
                }
            }
        }

        return false;
    }
}