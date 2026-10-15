class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1,min=0;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1)
        {
            int low=0,high=n-1;
            while(low<high)
            {
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            }
            return;
        }
        for(int i=n-1;i>pivot;i--)
        {
            if(nums[i]>nums[pivot])
            {
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        int low=pivot+1,high=n-1;
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}