import java.util.Scanner;
public class BalancedBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int bf = Math.abs(lh-rh);
        if(bf==1 || bf==0){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        else{
            return false;
        }
    }
    public static TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static int getHeight(TreeNode root){
        if(root==null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        while(n-->0){
            int val = sc.nextInt();
            root = insert(root,val);
        }
        System.out.println(isBalanced(root));
        sc.close();
    }
}
