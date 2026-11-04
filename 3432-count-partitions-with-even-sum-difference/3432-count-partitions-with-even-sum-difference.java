class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans=0;
        int currsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currsum+=nums[i];
            if((sum-(2*currsum))%2==0){
                ans++;
            }
        }
        return ans;
    }
}