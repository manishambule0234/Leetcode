class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        if (n<k) return res;
        sum(res,temp,k,n,1);
        return res;
    }
public static void sum(List<List<Integer>> res, List<Integer> temp, int k, int n, int idx) {
    if (temp.size() > k || n < 0) {
        return; // Prune invalid paths early
    }

    if (n == 0 && temp.size() == k) {
        res.add(new ArrayList<>(temp)); // Only add if both sum and size are valid
        return;
    }

    for (int i = idx; i <= 9; i++) {
        temp.add(i);
        sum(res, temp, k, n - i, i + 1); // i+1 to avoid reusing the same number
        temp.remove(temp.size() - 1); // Backtrack
    }
}


}