class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int i=0;
        char[] arr = s1.toCharArray();
        while(i<2){
            if (arr[i] != s2.charAt(i)) {
                char temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
            i++;
        }
        s1 = new String(arr);
        return s1.equals(s2);
    }
}