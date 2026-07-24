class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if(cost.length==1){
            return cost[0];
        }
        else if(cost.length==2){
            return cost[0]+cost[1];
        }
        int ans=0;
        int counter=1;
        for(int i=cost.length-1;i>=0;i--){
            if(counter%3!=0){
                ans+=cost[i];
            }
            counter++;
        }
        return ans;
    }
}