package solution;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;


/**
 * @author kk
 * @description 不同的二叉搜素树
 * @date 2024-10-22 09:07:29
 */
public class sln95 {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1,n);
    }
    public List<TreeNode> generateTrees(int start,int end){
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }
        //枚举可行根节点
        for(int i = start;i <= end;i++){
            //获取所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start,i -1);
            //获取所有可行的右子树的集合
            List<TreeNode> rightTrees = generateTrees(i+1,end);
            //依次遍历所有左右子树并及逆行拼接
            for(TreeNode left:leftTrees){
                for(TreeNode right:rightTrees){
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = left;
                    currentTree.right = right;
                    allTrees.add(currentTree);
                }
            }
        }
        return allTrees;
    }

}
