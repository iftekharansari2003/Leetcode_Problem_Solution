class Solution {
    public void moveZeroes(int[] nums) {
        int lastzero=0;
        int curr=1;

        while(lastzero<nums.length && curr<nums.length){
            if(nums[lastzero]==0 && nums[curr]!=0){
                int temp=nums[lastzero];
                nums[lastzero]=nums[curr];
                nums[curr]=temp;

                lastzero++;
                curr++;

            }
            else if(nums[lastzero]==0 && nums[curr]==0){
                curr++;
            }
            else{
                lastzero++;
                curr++;
            }

        }
    }
}