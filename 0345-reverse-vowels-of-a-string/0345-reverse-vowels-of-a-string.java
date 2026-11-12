class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder list = new StringBuilder();
        for(int i = 0;i < s.length();i++) 
        {
            if(vowels.indexOf(s.charAt(i)) != -1) 
            {
                list.append(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < s.length();i++) 
        {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) 
            {
                result.append(list.charAt(list.length() - 1));
                list.deleteCharAt(list.length() - 1);
            } 
            else 
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}