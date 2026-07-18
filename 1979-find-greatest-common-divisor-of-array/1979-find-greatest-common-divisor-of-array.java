class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(nums[i],min);
        }

        while(min!=0){
            int temp=max%min;
            max=min;
            min=temp;
        }
        return max;
    }
}