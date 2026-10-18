class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        if(nums.length == 0) {
            return 0;
        }

        int curr = 1;
        //Sort the array
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            }
            else if(nums[i]-1 == nums[i-1]) {
                curr++;
            } else {
                curr = 1;
            }
            max = Math.max(max, curr);

        }
        return max;
    }

}
