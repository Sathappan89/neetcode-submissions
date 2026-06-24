class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i<strs.length; i++) {
            //Sort the string -- start
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);
            //Sort the string -- end

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<String>> e: map.entrySet() ){
            ans.add(e.getValue());
        }
    return ans;
    }
}
