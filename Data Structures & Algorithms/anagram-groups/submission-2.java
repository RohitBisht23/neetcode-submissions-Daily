class Solution {

    private boolean anagram(String s, String t) {
        if(s.length() != t.length()) return false; 
        int charArr[] = new int[26];

        for(int i=0; i<s.length(); i++) {
            charArr[s.charAt(i)-'a']++;
        }


        for(int i=0; i<t.length(); i++) {
            charArr[t.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++) {
            if(charArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        if(strs.length == 1) {
            answer.add(List.of(strs[0]));
            return answer;
        }

        int visited[] = new int[strs.length];

        for(int i=0; i<strs.length; i++) {
            ArrayList<String> subAnas = new ArrayList<>();
            if(visited[i] == 1) {
                continue;
            }
            
            for(int j=0; j<strs.length; j++) {
                if(visited[j] == 1) {
                    continue;
                }
                if(anagram(strs[i], strs[j])) {
                    subAnas.add(strs[j]);
                    visited[j] = 1;
                }
            }
            answer.add(subAnas);
        }
        return answer;
    }
}
