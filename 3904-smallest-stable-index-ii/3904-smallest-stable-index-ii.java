class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        max[0]=nums[0];
        min[nums.length-1]=nums[nums.length-1];

        int ans=-1;

       for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<min[i+1]){
                min[i]=nums[i];
            }
            else{
                min[i]=min[i+1];
            }
        }

        int prefixMax=nums[0];

        for(int i=0;i<nums.length;i++){
        prefixMax = Math.max(prefixMax, nums[i]);
        if(prefixMax-min[i]<=k){
            return i;
        }
        }

        return ans;
    }
}