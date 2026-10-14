class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
                count++;
            }
            if(count==3)
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}