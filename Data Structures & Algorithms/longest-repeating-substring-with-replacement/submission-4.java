class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int right = 0;

        int freq[] = new int[128];
        int maxF = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);
            freq[ch-'A']++;
            maxF = Math.max(maxF, freq[ch-'A']);

            //check if valid
            while((right-left+1) - maxF > k) {
                freq[s.charAt(left)-'A']--;
                maxF = Math.max(maxF, freq[s.charAt(left)]);
                left++;
            }

            if((right - left +1) - maxF <= k) {
                max = Math.max(max, right-left+1);
            }
            right++;
        }
        
        return max;
    }

    
}
