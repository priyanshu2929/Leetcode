class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> res = new Stack<>(); 
        res.push(-1);

        int maxLength = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                res.push(i);
            }else{
                res.pop();
                if(res.isEmpty()){
                    res.push(i);
                }else{
                    maxLength = Math.max(maxLength,i-res.peek());
                }
            }

        }
        return maxLength;  
    }
}