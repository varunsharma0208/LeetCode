class Solution {
    public int smallestEvenMultiple(int n) {
        int small=0;
        for(int i=n;i>=n;i++)
        {
            if(i%n==0)
            {
                if(i%2==0)
                {
                    small=i;
                    break;
                }
            }
        }
        return small;
    }
}