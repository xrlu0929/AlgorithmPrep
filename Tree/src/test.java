/**
 * Created by annaxlu on 5/6/18.
 */
public class test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(12);
        System.out.println("Expected: true  " + root.findTreeNodeRec(root, 9));
        System.out.println("Expected: false " + root.findTreeNodeRec(root, 19));
    }

}
