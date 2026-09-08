class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int[] answer = new int[k];
        for(int i=0;i<k;i++)
        {
            int max=0;
            int maxKey=0;
            for(int key:hm.keySet())
            {
                if(hm.get(key)>max)
                {
                    max=hm.get(key);
                    maxKey=key;
                }
            }
            answer[i]=maxKey;
            hm.remove(maxKey);
        }
        return answer;
    }
}