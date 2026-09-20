class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0 || carry>0)
        {
            int s=0,s1=0,s2=0;
            if(i>=0)
            {
                s1=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                s2=num2.charAt(j)-'0';
                j--;
            }
            s=s1+s2+carry;
            ans.append(s%10);
            carry=s/10;
        }
        return ans.reverse().toString();
    }
}