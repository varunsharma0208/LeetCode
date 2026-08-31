class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String str=strs[i];
            char[] characters=str.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);

            if(map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else
            {
                List<String> l1=new ArrayList<>();
                l1.add(str);
                map.put(key,l1);
            }
        }
        return new ArrayList<>(map.values());
    }
}