class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;

        for(int i = 0;i<nums.length;i++){
            currSum += nums[i];
            while(currSum >= target){
                if(i-left+1 <minLen){
                    minLen = i-left+1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen :0;
    }
}