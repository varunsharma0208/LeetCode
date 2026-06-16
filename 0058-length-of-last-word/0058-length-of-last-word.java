class Solution {
    public int lengthOfLastWord(String s) {
        String a[]=s.split(" ");
        String word=a[a.length-1];
        return word.length();
    }
}