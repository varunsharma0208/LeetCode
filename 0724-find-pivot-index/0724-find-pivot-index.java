class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft[]=new int[nums.length];
        int sumsLeft=0,sumsRight=0;
        int sumRight[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sumsLeft=sumsLeft+nums[i];
            sumLeft[i]=sumsLeft;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            sumsRight=sumsRight+nums[i];
            sumRight[i]=sumsRight;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(sumLeft[i]==sumRight[i])
            {
                return i;
            }
        }
        return -1;
    }
}