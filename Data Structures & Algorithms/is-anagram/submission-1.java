class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        } 

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // Reduce counts based on characters in string `t`
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch); // Remove key when count reaches 0
            }
        }

        // Check if map is empty (all characters matched)
        return map.isEmpty();
    }
}
