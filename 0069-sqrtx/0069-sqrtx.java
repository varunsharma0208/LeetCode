class Solution {
    public int mySqrt(int x) {
        int answer=0;
        for(int i=1;i<=x;i++)
        {
            if((long)i*i <= x)
            {
                answer=i;
            }
            else
            {
                break;
            }
        }
        return answer;
    }
}