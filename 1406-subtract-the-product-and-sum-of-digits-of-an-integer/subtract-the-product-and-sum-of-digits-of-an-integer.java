class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        int diff ;

        while(n > 0){
            sum += n%10;
            mul *= n%10;
             n = n/10;
        }
        diff = mul - sum;
        return diff;
    }
}