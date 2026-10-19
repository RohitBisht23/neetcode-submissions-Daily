class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lastSeen[] = new int[128];
        Arrays.fill(lastSeen, -1);

        int left = 0;
        int right = 0;
        int max = 0;

        for(right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);

            if(lastSeen[ch] >= left) {
                left = lastSeen[ch]+1;
            }

            lastSeen[ch] = right;
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
