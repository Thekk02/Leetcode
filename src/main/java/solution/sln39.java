package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 组合总和
 * @date 2024-7-9 16:22:54
 */
public class sln39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;

    }
    public void dfs(int[] candidates,int target,List<List<Integer>> ans,List<Integer> combine,int idx){
        if(idx == candidates.length){
            return;
        }
        if(target == 0){
            ans.add(combine);
            return;
        }
        dfs(candidates,target,ans,combine,idx + 1);
        //选择当前数
        combine.add(candidates[idx]);
        dfs(candidates, target - candidates[idx], ans, combine, idx);
        combine.remove(combine.size() - 1);
    }
}
