import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class InorderTraversal {

    public static void inorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, arr);
        arr.add(root.data);
        inorderTraversal(root.right, arr);
    }

    public static void main(String[] args) {
        // Sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);

        System.out.println("Inorder Traversal: " + result);
    }
}
