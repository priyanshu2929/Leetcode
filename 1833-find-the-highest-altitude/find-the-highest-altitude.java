class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;

        for(int i = 0;i<gain.length;i++){
            currAlt += gain[i];
            maxAlt = Math.max(maxAlt , currAlt);
        }
        return maxAlt;
    }
}