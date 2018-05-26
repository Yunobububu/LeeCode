package Leecode.ImpInJava;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        int[] array = {10,3,4,91,22,51,6};
        TreeNode root = buildBST(array);
        inOrderTraversal(root);
        System.out.println("中序遍历BST各节点的值: "+ list);
        //打印root的值
        System.out.println("BST root的值: " + root.val);


    }
    //二叉树的递归中序遍历
    public static void inOrderTraversal(TreeNode root){
        if(root == null) return ;
        if(root.left != null){
            inOrderTraversal(root.left);
        }
        list.add(root.val);
        inOrderTraversal(root.right);
    }
    //输入一个数组建立二叉查找树BST
    public static TreeNode buildBST(int[] array){
        TreeNode root = new TreeNode(array[0]);
        for(int i = 1;i < array.length ;i++){
            TreeNode node = new TreeNode(array[i]);
            maintainBST(node,root);
        }
        return root;
    }
    //输入数组建立二叉树
    public static void buildTreeNode(int[] array){

    }
    //向BST加入节点时保持BST
    public static void maintainBST(TreeNode node,TreeNode root){
        if(root ==null) {
            root = node;
            return;
        }
        if(node.val < root.val){
            if(root.left == null){
                root.left = node;
                return;
            }
            maintainBST(node,root.left);

        }else {
            if(root.right == null) {
                root.right = node;
                return;
            }
            maintainBST(node,root.right);
        }
    }



}
