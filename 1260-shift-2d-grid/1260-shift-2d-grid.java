class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        
        int arr[]=new int[n*m];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[l]=grid[i][j];
                l++;
            }
        }

        while(k>0){
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
            k--;
        }

        l = 0;
for (int i = 0; i < n; i++) {
    List<Integer> temp = new ArrayList<>();
    for (int j = 0; j < m; j++) {
        temp.add(arr[l++]);
    }
    ans.add(temp);
}

        return ans;
    }
}