class Solution {
    public boolean check(int[] nums) {
        int dip=0;
        if(nums[0]<nums[nums.length-1])
        {
            dip++;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                dip++;
            }
        }
        if(dip<=1)
        {
            return true;
        }
        return false;
    }
}