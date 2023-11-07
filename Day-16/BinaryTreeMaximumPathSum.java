import java.util.Scanner;

public class BinaryTreeMaximumPathSum {
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
    public static int maxPathSum(TreeNode root) {
        int res[] = new int[1];
        res[0] = Integer.MIN_VALUE;
        maxPath(root,res);
        return res[0];
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
    public static int maxPath(TreeNode root,int[] res) {
        if(root==null){
            return 0;
        }
        int left = Math.max(0,maxPath(root.left,res));
        int right =Math.max(0,maxPath(root.right,res));
        res[0] = Math.max(res[0],root.val+left+right);
        return root.val+Math.max(left,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        while(n-->0){
            int val = sc.nextInt();
            root = insert(root,val);
        }
        System.out.println(maxPathSum(root));
        sc.close();
    }
}
