class Solution {
    public int minEatingSpeed(int[] piles, int hour) {
       int max = Arrays.stream(piles)
            .max()
            .orElse(0);
        
        int min = 1;
        int minBanana = 0;

        int left = min;
        int right = max;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            
            if(position(piles, mid) <= hour) {
                minBanana = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
            
        }
        return minBanana;
    }

    private int position(int piles[], int hour) {
        int totalHour = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHour += Math.ceil((double) (piles[i]) / (double) (hour));
        }
        return totalHour;
    }
}
