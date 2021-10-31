package ssl;


public class TreeSearch {
        // 创建一个二叉树
        public TreeNode getTargetTree() {
            // 叶子节点
            TreeNode G = new TreeNode("G");
            TreeNode D = new TreeNode("D");
            TreeNode E = new TreeNode("E", G, null);
            TreeNode B = new TreeNode("B", D, E);
            TreeNode H = new TreeNode("H");
            TreeNode I = new TreeNode("I");
            TreeNode F = new TreeNode("F", H, I);
            TreeNode C = new TreeNode("C", null, F);
            // 构造根节点
            TreeNode root = new TreeNode("A", B, C);
            return root;
        }


        /**
         * 前序遍历
         */
        public void preorderVisitTreeNode(TreeNode node) {
            if (null != node) {

                System.out.print(node.value);

                if (null != node.leftchildren) {
                    preorderVisitTreeNode(node.leftchildren);
                }
                if (null != node.rightchildre) {
                    preorderVisitTreeNode(node.rightchildre);
                }
            }
        }

    /**
     * 中序遍历
     */
    public void inorderVisitTreeNode(TreeNode node) {
        if (null != node.leftchildren) {
            inorderVisitTreeNode(node.leftchildren);
        }
            System.out.print(node.value);
        if (null != node.rightchildre) {
            inorderVisitTreeNode(node.rightchildre);
            }
        }

    /**
     * 后序遍历
     */
    public void postorderVisitTreeNode(TreeNode node) {
        if (null != node.leftchildren) {
            postorderVisitTreeNode(node.leftchildren);
        }
        if (null != node.rightchildre) {
            postorderVisitTreeNode(node.rightchildre);
        }
        System.out.print(node.value);

    }


        public static void main(String[] args) {

            TreeSearch treeSearch = new TreeSearch();
            TreeNode tree = treeSearch.getTargetTree();

            System.out.print("前序遍历:");
            treeSearch.preorderVisitTreeNode(tree);
            System.out.println("");

            System.out.print("中序遍历:");
            treeSearch.inorderVisitTreeNode(tree);
            System.out.println("");

            System.out.print("后序遍历:");
            treeSearch.postorderVisitTreeNode(tree);
            System.out.println("");
        }
    }

