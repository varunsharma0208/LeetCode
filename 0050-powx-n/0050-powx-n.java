class Solution {
    public double myPow(double x, int n) 
    {
        long num = n;
        if (num < 0)
        {
            num = -num;
        }
        double result = 1.0;
        while (num != 0) 
        {
            if (num % 2 == 1) 
            {
                result = result * x;
                num = num - 1;
            }
            x = x * x;
            num = num / 2;
        }
        if (n < 0) 
        {
            return 1.0 / result;
        } 
        else 
        {
            return result;
        }
    }
}