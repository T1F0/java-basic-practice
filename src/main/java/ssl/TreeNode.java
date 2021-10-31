package ssl;

//节点数据结构
class TreeNode {

    String value = null;
    TreeNode leftchildren = null;
    TreeNode rightchildre = null;

    public TreeNode(String value, TreeNode leftchildren, TreeNode rightchildre) {
        this.value = value;
        this.leftchildren = leftchildren;
        this.rightchildre = rightchildre;
    }

    public TreeNode(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLeftchildren(TreeNode leftchildren) {
        this.leftchildren = leftchildren;
    }

    public void setRightchildre(TreeNode rightchildre) {
        this.rightchildre = rightchildre;
    }

    public String getValue() {
        return value;
    }

    public TreeNode getLeftchildren() {
        return leftchildren;
    }

    public TreeNode getRightchildre() {
        return rightchildre;
    }
}
