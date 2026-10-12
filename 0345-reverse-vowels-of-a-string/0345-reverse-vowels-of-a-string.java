class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int i=0;
        int j=s.length()-1;
        String vowel="aeiouAEIOU";
        while(i<j){
            if(vowel.indexOf(s.charAt(i))>=0 && vowel.indexOf(s.charAt(j))>=0){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            else if(vowel.indexOf(s.charAt(i))>=0){
                j--;
            }
            else if(vowel.indexOf(s.charAt(j))>=0){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}