package solution;

import java.util.ArrayList;
import java.util.List;

import DataStructure.*;


/**
 * @author kk
 * @description 多叉树的后序遍历
 * @date 2024-10-17 09:31:51
 */
public class sln590 {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        helper(ans,root);
        return ans;
    }
    public void helper (List<Integer> ans,Node node){
        if(node == null){
            return ;
        }
        for(Node temp : node.children){
            helper(ans,temp);
        }
        ans.add(node.val);
    }
}
