class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        if(nums.length==0){
            return nums[0]+1;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum+=nums[i];
        }
        Arrays.sort(nums);

        int ans=0;
        boolean found=false;
         int temp=sum;
        while(!found){
            if(binarysearch(temp,nums)){
                found=true;
                return temp;

            }
            temp++;
        }
        return ans;
    }
    public static boolean binarysearch(int temp,int nums[]){
        int si=0;
        int ei=nums.length-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;

            if(nums[mid]==temp){
                return false;
            }
            else if(nums[mid]<temp){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return true;
    }
}