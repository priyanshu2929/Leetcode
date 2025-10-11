class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        char arr[] = word.toCharArray();
        int n = arr.length;

        for(int i = 0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        return count;
    }
}