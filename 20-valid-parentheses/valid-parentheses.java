class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> deq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                deq.push(ch);
            } else {
                if (deq.isEmpty()) 
                    return false;
                
                if ((ch == ')' && deq.peek() == '(') || (ch == '}' && deq.peek() == '{')
                        || (ch == ']' && deq.peek() == '[')) {
                    deq.pop();

                } else {
                    return false;
                }
            }
        }
        return deq.isEmpty();

    }
}