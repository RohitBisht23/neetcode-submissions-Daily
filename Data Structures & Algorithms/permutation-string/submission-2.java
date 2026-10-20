class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int freq[] = new int[26];

        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
        }

        int left = 0;
        int right = s1.length()-1;

        while(right < s2.length()) {
            int freqW[] = new int[26];

            for(int i=left; i<=right; i++) {
                freqW[s2.charAt(i)-'a']++;
            }

            boolean currWindowMatch = true;
            //Match
            for(int i=0; i<26; i++) {
                if(freq[i] != freqW[i]) {
                    currWindowMatch = false;
                    break;
                }
            }
            if(currWindowMatch) return true;
            right++;
            left++;
        }
        return false;
    }
}
