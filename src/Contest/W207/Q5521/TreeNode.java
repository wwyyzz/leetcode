package Contest.W207.Q5521;

public class TreeNode {
    public int[] val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int[] val) { this.val = val; }
    public TreeNode(int[] val, TreeNode left, TreeNode right) {
          this.val[0] = val[0];
          this.val[1] = val[1];
          this.left = left;
          this.right = right;
      }

}

