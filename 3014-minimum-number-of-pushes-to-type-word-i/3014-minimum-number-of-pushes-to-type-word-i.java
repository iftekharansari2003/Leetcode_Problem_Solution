class Solution {
    public int minimumPushes(String word) {
        int ans=0;

        int length=word.length();
        int counter=1;
        while(length>0){
            if(length>=8){
                ans+=(8)*counter;
                counter++;
                length-=8;
            }
            else{
                ans+=length*counter;
                length-=length;
            }
        }
        return ans;
    }
}