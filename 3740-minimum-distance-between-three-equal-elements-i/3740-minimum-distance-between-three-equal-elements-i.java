class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            int curr=nums[i];
            for(int l=i;l<nums.length;l++){
                if(nums[l]==curr){
                    arr.add(l);
                }
                if(arr.size()==3){
                    break;
                }
            }
            if(arr.size()==3){
                System.out.print(arr.get(0)+","+arr.get(1)+","+arr.get(2));
                int curr1=Math.abs(arr.get(0)-arr.get(1))+Math.abs(arr.get(1)-arr.get(2))+Math.abs(arr.get(2)-arr.get(0));
                ans=Math.min(ans,curr1);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
}