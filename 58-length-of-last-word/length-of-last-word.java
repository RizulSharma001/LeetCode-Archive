class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int count = 0;
        while(s.charAt(n) == ' '){
            n--;
        }
        while(n >= 0 && s.charAt(n) != ' '){
            n--;
            count++;
        }
        return count;
    }
}