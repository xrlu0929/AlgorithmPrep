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
        find
     */
    /*
        find recursive
     */
    public boolean findTreeNodeRec(TreeNode root, int target){
        while(root!=null) {
            if(target< root.key) {
                findTreeNodeRec(root.)
            }
        }
        return false;
    }
    /*
        find iterative
     */
    public boolean findTreeNodeIte(TreeNode root, int target){
        while(root!=null) {

        }
        return false;
    }

    public TreeNode insertRec(TreeNode root, int target) {
        if(root== null) {
            return new TreeNode(target);
        }


    }

}
