class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            //Convert string to character array
            char arr[] = str.toCharArray();

            //Short it
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
