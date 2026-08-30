class Solution {
    public int minimumDeletions(int[] nums) {
        int maxidx=0;
        int minidx=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxidx]) {
                maxidx = i;
            }
            if (nums[i] < nums[minidx]) {
                minidx = i;
            }
        }

        int small=Math.min(minidx,maxidx);
        int big=Math.max(minidx,maxidx);
        int left=big+1;
        int right=(nums.length-small);
        int both=(small+1)+(nums.length-big);

        return Math.min(left,Math.min(right,both));
    }
}