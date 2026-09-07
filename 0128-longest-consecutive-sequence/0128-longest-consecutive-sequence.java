class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int current,longest=0;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int n:hs)
        {
            if(!hs.contains(n-1))
            {
                 current = n;
                 int count=1;
                 while(hs.contains(current+1))
                 {
                    current++;
                    count++;
                 }
                if(longest<count)
                {
                    longest=count;
                }
            }
        }
        return longest;
    }
}