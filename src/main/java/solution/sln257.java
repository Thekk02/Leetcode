package solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉树的所有路径
 * @date 2024-10-17 08:31:40
 */
public class sln257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root,"",paths);
        return paths;
    }

    public void constructPaths(TreeNode root,String path,List<String> paths){
        if(root != null){
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if(root.left == null && root.right == null){
                paths.add(pathSB.toString());
            }else{
                pathSB.append("->");//当前节点不是叶子节点，继续遍历
                constructPaths(root.left,pathSB.toString(),paths);
                constructPaths(root.right,pathSB.toString(),paths);
            }
        }
    }
}
