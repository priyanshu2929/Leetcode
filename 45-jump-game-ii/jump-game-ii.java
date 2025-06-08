class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int r = 0;
        int l = 0;
        while(r<nums.length-1){
            int far = 0;
            for(int i = 0;i<=r;i++){
                far = Math.max(far,i+nums[i]);
            }
            l = r+1;
            r = far;
            jump++;
        }
        return jump;
    }
}