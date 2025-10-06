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

    public static void preOrderTraversal(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }

        arr.add(root.data);
        preOrderTraversal(root.left, arr);
        preOrderTraversal(root.right, arr);
    }

    public static void PostOrderTraversal(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }

        preOrderTraversal(root.left, arr);
        preOrderTraversal(root.right, arr);
        arr.add(root.data);
    }

    public static void main(String[] args) {
        // Sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = new ArrayList<>();
        //inorderTraversal(root, result);
        //preOrderTraversal(root, result);
        PostOrderTraversal(root, result);
        //System.out.println("inorder Traversal: " + result);
        //System.out.println("preorder Traversal: " + result);
        System.out.println("postorder Traversal: " + result);
    }
}
