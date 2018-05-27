package Leecode.ImpInJava;

import java.util.Stack;

/*

 */
public class MirrorBT {
    private static int[] array = {8,16,10,5,7,9,11};
    private static TreeNode root = BST.buildBST(array);
    public static void main(String[] args){
//        mirrorRecursive(root);
//        BST.preOrderTraversal(root);
//        System.out.println(BST.list);
        mirrorWithOutRecursive(root);
        BST.preOrderTraversal(root);
        System.out.println(BST.list);
    }
    //递归镜像二叉树
    public static void mirrorRecursive(TreeNode root){
        if(root == null){return;}
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorRecursive(root.left);
        mirrorRecursive(root.right);
    }
    //二叉树的非递归实现
    public static void mirrorWithOutRecursive(TreeNode root){
        //根节点为空直接返回
        if(root == null){return ;}
        //借助栈结构来实现非递归
        Stack<TreeNode> stack = new Stack<>();
        //把root节点入栈
        stack.push(root);
        while(!stack.empty()){
            //栈顶节点出栈
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
    }
}
