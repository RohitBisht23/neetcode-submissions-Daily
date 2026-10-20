class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int freq[] = new int[26];

        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
        }

        int left = 0;
        int right = s1.length()-1;
        int windowSize = s1.length();

        for(int i=0; i<s2.length(); i++) {
            int freqW[] = new int[26];
            int windowIdx =0;
            int idx = i;

            while(windowIdx < windowSize && idx < s2.length()) {
                freqW[s2.charAt(idx)-'a']++;
                windowIdx++;
                idx++;
            }

            if(same(freq, freqW)) {
                return true;
            }

        }
        return false;
    }

    private boolean same(int a[], int b[]) {
        for(int i=0; i< 26; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
