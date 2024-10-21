package solution;

import DataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉搜索树中的众树
 * @date 2024-10-17 08:08:13
 */
public class sln501 {
    List<Integer> ans = new ArrayList<>();
    int base,count,maxCount;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] mode = new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            mode[i] = ans.get(i);
        }
        return mode;
    }

    public void dfs(TreeNode o){
        if(o == null){
            return;
        }
        dfs(o.left);
        update(o.val);
        dfs(o.right);
    }
    public void update(int x){
        if(x == base){
            count++;
        }else{
            count = 1;
            base = x;
        }
        if(count == maxCount){
            ans.add(base);
        }
        if(count > maxCount){
            maxCount = count;
            ans.clear();
            ans.add(base);
        }
    }

}
