class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            while(temp!=0)
            {
                int x=temp%10;
                if(x==digit)
                {
                    count ++;
                }
                temp=temp/10;
            }
        }
        return count;
    }
}