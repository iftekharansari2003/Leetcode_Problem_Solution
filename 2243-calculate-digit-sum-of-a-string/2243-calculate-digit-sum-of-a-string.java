class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            int curr=0;
        int count=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            curr += s.charAt(i) - '0';
            count++;
            if (count == k) {
                    sb.append(curr);
                    count = 0;
                    curr = 0;
                }
            }

            if (count > 0) {
                sb.append(curr);
            }
            s = sb.toString();
        }

      return s;
    }
}