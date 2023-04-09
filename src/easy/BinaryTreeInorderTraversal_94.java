package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
    // https://icksw.tistory.com/203

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;

        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while(node != null || !stack.isEmpty()) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }

            list.add(stack.peek().val);
            node = stack.pop().right;
        }
        return list;
    }*/


}

