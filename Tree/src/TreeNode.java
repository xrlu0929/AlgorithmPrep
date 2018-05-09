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

}
