class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int ans[] =new int[num];
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<num;i++){
            int curr=Math.min(9,sum);
            ans[i]=curr;
            sb.append(curr);
            sum-=curr;
        }
        if(sum>0){
            return "";
        }
        return sb.toString();
    }
}