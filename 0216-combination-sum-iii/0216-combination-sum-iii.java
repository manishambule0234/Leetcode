class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        if (n<k) return res;
        sum(res,temp,k,n,1);
        return res;
    }
public static void sum(List<List<Integer>> res, List<Integer> temp, int k, int n, int idx) {

        if (n == 0 && temp.size() == k) {
        res.add(new ArrayList<>(temp));
        return;
    }

    
    if (n < 0 || temp.size() > k || idx > 9) return;



    // Choose idx
    temp.add(idx);
    sum(res, temp, k, n - idx, idx + 1);
    temp.remove(temp.size() - 1);

    // Don't choose idx
    sum(res, temp, k, n, idx + 1);
}


}