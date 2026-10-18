class Solution {

    private String getFrequencyStr(String str) {
        int freqArr[] = new int[26];
        for(char c : str.toCharArray()) {
            freqArr[c - 'a']++;
        }

        StringBuilder ansStr = new StringBuilder("");

        for(int i=0; i<freqArr.length; i++) {
            if(freqArr[i] > 0) {
                char curr = (char) (i+ 'a');
                ansStr.append(curr);
                ansStr.append(freqArr[i]);
            }
        }

        return ansStr.toString();
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String freqStr = getFrequencyStr(strs[i]);

            map.putIfAbsent(freqStr, new ArrayList<>());
            map.get(freqStr).add(strs[i]);
        }
        
        ans.addAll(map.values());
        return ans;
    }
}
