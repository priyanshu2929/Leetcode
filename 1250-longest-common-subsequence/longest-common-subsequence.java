class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int map[] : dp){
            Arrays.fill(map,-1);
        }
       return helper(text1,text2,0,0,dp);
    }
     public static int helper(String text1,String text2,int n, int m,int dp[][]){
           if(n == text1.length() || m == text2.length() )
           return 0;

            if(dp[n][m] != -1){
                return dp[n][m];
            }
           if(text1.charAt(n) == text2.charAt(m)){
           dp[n][m] = helper(text1,text2,n+1,m+1,dp)+1;
           } else{
           dp[n][m] = Math.max(helper(text1,text2,n+1,m,dp),helper(text1,text2,n,m+1,dp));
           }
           return dp[n][m];
        }
}