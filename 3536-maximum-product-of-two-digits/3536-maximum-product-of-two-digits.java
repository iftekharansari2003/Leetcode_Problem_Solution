class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
       while (n > 0) {
            int num = n % 10;

            if (num >= max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            n /= 10;
        }
        return max*secondMax;
    }
}