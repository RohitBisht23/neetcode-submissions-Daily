class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int max = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int x : set) {
            

            if(set.contains(x-1)) continue; //Not a starting point
            else {
                int curr = 1;
                x = x+1;
                while(set.contains(x)) {
                    x = x + 1;
                    curr++;
                }
                max = Math.max(curr, max);
            }
        }
        return max;
    }

}
