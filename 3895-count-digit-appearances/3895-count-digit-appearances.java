class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }

        int ans=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)-'0'==digit){
                ans++;
            }
        }
        return ans;
    }
}