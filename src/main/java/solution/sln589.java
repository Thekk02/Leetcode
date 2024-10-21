package solution;

import DataStructure.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description N叉树的前序遍历
 * @date 2024-10-21 12:59:25
 */
public class sln589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        dfs(root,list);
        return list;
    }
    public void dfs(Node root,List list){
        list.add(root.val);
        for(Node node: root.children){
            dfs(node,list);
        }
    }
}
