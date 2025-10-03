class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||   // all uppercase
               word.equals(word.toLowerCase()) ||   // all lowercase
               word.equals(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
    }
}
