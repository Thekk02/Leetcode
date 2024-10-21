package solution;

import DataStructure.TreeNode;
import com.sun.deploy.panel.TreeEditors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kk
 * @description 二叉搜索树节点最小距离
 * @date 2024-10-21 16:07:44
 */
public class sln783 {
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int num = Integer.MAX_VALUE;
        dfs(root,list);
        Integer[] ans = list.toArray(new Integer[0]);
        Arrays.sort(ans);
        for(int i = 0;i < ans.length -1;i++){
            num = Math.min(num,ans[i+1] - ans[i]);
        }
        return num;
    }
    public void dfs(TreeNode node, List list){
        if(node == null){return ;}
        list.add(node.val);
        dfs(node.left,list);
        dfs(node.right,list);
    }
}
