package solution;

import DataStructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 两数之和-输入二叉搜索树
 * @date 2024-10-17 10:30:43
 */
public class sln653 {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(set.contains(k - root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
