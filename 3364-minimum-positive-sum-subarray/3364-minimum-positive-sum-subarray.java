class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size()-l+1;i++){
            int count=0;
            int currsum=0;
            for(int j=i;j<nums.size();j++){
                count++;
                currsum+=nums.get(j);
                if(count>=l && count<=r && currsum>0){
                    
                    ans=Math.min(ans,currsum);
                }
            }
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}