package ssl.study.algorithmPractice.binaryTree;

import javax.swing.tree.TreeNode;

public class BinaryTreeTest {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
//            TreeNode left = invertTree(root.left);
//            TreeNode right = invertTree(root.right);
//            root.left = right;
//            root.right = left;
            return root;
        }
}
