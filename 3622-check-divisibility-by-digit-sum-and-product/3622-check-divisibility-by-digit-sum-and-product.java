class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0,product=1;
        while(x!=0)
        {
            int temp=x%10;
            sum=sum+temp;
            product=product*temp;
            x=x/10;
        }
        int digitSum=sum+product;
        if(n%digitSum==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}