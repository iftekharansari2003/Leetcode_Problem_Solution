class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        boolean ans=true;

        for(int p=2;p<=n-2;p++){
            int temp=n;
            StringBuilder sb=new StringBuilder("");
            while(temp>1){
                sb.append(temp%p);
                temp=temp/p;
            }
            sb.append(1);
            sb.reverse();

            int i=0;
            int j=sb.length()-1;
            System.out.print(sb);
            while(i<j){
                if(sb.charAt(i)!=sb.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            }
        
        return true;
    }
}