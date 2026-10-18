class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i}; // Return the indices of the two numbers
            }

            map.put(nums[i], i); // Store the current number and its index
        }
        return ans;
    }
}
