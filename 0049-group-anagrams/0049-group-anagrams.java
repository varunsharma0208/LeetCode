class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String str=strs[i];
            char[] characters = new char[str.length()];
            for (int j = 0; j < str.length(); j++) 
            {
                characters[j] = str.charAt(j);
            }
            Arrays.sort(characters);
            String key="";
            for(int k=0;k<characters.length;k++)
            {
                key=key+characters[k];
            }
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