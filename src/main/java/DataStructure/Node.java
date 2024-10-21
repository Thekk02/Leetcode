package DataStructure;

import java.util.List;

/**
 * @author kk
 * @description 多叉树的节点定义类
 * @date 2024-10-17 09:31:23
 */public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}