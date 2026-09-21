class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0 || carry>0)
        {
            int s=0,s1=0,s2=0;
            if(i>=0)
            {
                s1=a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                s2=b.charAt(j)-'0';
                j--;
            }
            s=s1+s2+carry;
            ans.append(s%2);
            carry=s/2;
        }
        return ans.reverse().toString();
    }
}