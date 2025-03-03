class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int i=0;
        rec(candidates,target,ans,ds,i);
        return ans;        
    }
    static void rec(int[] arr,int k,List<List<Integer>> ans, List<Integer> ds,int i)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(i>arr.length-1 || k<0) return;
        ds.add(arr[i]);
        rec(arr,k-arr[i],ans,ds,i);
        ds.remove(ds.size()-1);
        rec(arr,k,ans,ds,i+1);
    }
}