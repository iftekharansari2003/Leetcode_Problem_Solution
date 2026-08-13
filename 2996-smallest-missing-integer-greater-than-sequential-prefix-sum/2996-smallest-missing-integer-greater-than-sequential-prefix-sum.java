class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> hs=new HashSet<>();
        if(nums.length==0){
            return nums[0]+1;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            sum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        Arrays.sort(nums);

        int ans=0;
        boolean found=false;
         int temp=sum;
        while(!found){
            if(!hs.contains(temp)){
                found=true;
                return temp;

            }
            temp++;
        }
        return ans;
    }
}