import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by annaxlu on 5/6/18.
 */
public class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int v) {
        this.key = v;
    }
//    public int getKey() {
//        return key;
//    }

    /*
        in a binary search tree
        find
     */
    /*
        find recursive
     */
    public boolean findTreeNodeRec(TreeNode root, int target){
        if(root== null) {
            return false;
        }else if (root.key == target) {
            return true;
        }

        if (target < root.key) {
            return findTreeNodeRec(root.left, target);
        } else {
            return findTreeNodeRec(root.right, target);
        }

    }
    /*
        find iterative
     */
    public boolean findTreeNodeIte(TreeNode root, int target){
//        while(root!=null) {
//
//        }
        return false;
    }

    public TreeNode insertRec(TreeNode root, int target) {
        if(root== null) {
            return new TreeNode(target);
        }

        else {
            return new TreeNode(target);
        }
    }

    public void inorder_rec(TreeNode root) {
        if(root == null) return;
        inorder_rec(root.left);
        System.out.print(root.key);
        inorder_rec(root.right);
    }
    /*
        iterative
     */
    public void inorder_itr(TreeNode root) {
        if(root == null) return;

        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode helper = root;
        while(helper != null || stack != null) {
            helper = helper.left;
            stack.offerFirst(root);
        }
    }


    public void preOrder(TreeNode root) {
        if(root == null) return;

        Deque<TreeNode> stack = new LinkedList<>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) { //存放在heap中
            TreeNode curr = stack.pollFirst();
            if(curr.right != null) {
                stack.offerFirst(curr.right);
            }
            System.out.println();
        }


    }

}
