class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            int left=target-value;
            if(map.containsKey(left))
            {
                return new int[] {map.get(left),i};
            }
            map.put(value,i);
        }
        return new int[] {};
    }
}