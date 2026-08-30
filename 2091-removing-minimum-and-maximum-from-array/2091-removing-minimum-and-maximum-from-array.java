class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        int min=Integer.MAX_VALUE;
        int minidx=-1;

        if(nums.length==1||nums.length==2){
            return nums.length;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxidx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minidx=i;
            }
        }
        System.out.print(minidx+","+maxidx);
        int ans=0;
        int small=Math.min(minidx,maxidx);
        int big=Math.max(minidx,maxidx);
        int left=big+1;
        int right=(nums.length-small);
        int both=(small+1)+(nums.length-big);

        ans=Math.min(left,Math.min(right,both));

        return ans;
    }
}