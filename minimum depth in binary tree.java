class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(l==0||r==0){
            return Math.max(l,r)+1;
        }
       return Math.min(l,r)+1;
    }
}