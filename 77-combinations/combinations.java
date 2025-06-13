class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(1,comb,res,n,k);
        return res;
    }

    public static void backtrack(int start , List<Integer> comb, List<List<Integer>> res,int n, int k){
        if(comb.size() == k){
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start;i<=n;i++){
            comb.add(i);
            backtrack(i+1,comb,res,n,k);
            comb.remove(comb.size()-1);
        }

    }
}