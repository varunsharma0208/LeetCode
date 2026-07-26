class Solution {
    public int maximumProduct(int[] nums) {
        int max;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }              
            }
        }
        int n=nums.length;
        int product1=nums[n-1]*nums[n-2]*nums[n-3];
        int product2=nums[0]*nums[1]*nums[n-1];
        if(product1>product2)
        {
            max=product1;
        }
        else
        {
            max=product2;
        }
        return max;
    }
}