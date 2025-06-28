class Solution {
    public int maximumCount(int[] nums) {
        int poscount = 0;
        int negcount = 0;

        int count = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > 0)
                poscount++;
            if (i < 0)
                negcount++;
        }
        count = Math.max(poscount, negcount);
        return count;
    }
}