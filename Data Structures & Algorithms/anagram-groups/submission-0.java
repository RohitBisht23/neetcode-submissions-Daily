class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String str = strs[i];
            char[] currArr = str.toCharArray();
            Arrays.sort(currArr); // Sort the characters in the string
            String sortedStr = new String(currArr); // Convert sorted char array to a string

            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str); 
        }

        ans.addAll(map.values());
        return ans;
    }
}
