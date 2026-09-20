class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
        {
            return "";
        }
        String start=strs[0];
        int prefixLength=start.length();
        for(int i=1;i<strs.length;i++)
        {
            int count=0;
            while(count<prefixLength && count<strs[i].length() && start.charAt(count)==strs[i].charAt(count))
            {
                count++;
            }
            prefixLength=count;
        }
        String answer="";
        for(int i=0;i<prefixLength;i++)
        {
            answer=answer+start.charAt(i);
        }
        return answer;
    }
}