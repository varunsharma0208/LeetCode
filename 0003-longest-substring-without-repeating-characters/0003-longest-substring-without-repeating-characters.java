class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0,count=0,longest=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!hs.contains(ch))
            {
                hs.add(ch);
                count++;
            }
            else
            {
                while(hs.contains(ch))
                {
                    hs.remove(s.charAt(left));
                    left++;
                    count--;
                }
                hs.add(ch);
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}