package Leecode.ImpInJava;

import Leecode.ImpInJava.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        int[] array = {6,3,5,7,8};
        TreeNode root = buildBST(array);
        //inOrderTraversal(root);
        //System.out.println("中序遍历BST各节点的值: "+ list);
        //打印数组的最大值
        System.out.println("BST中最大值: "+ MAXSUM(root));
        //打印数组的最小值
        System.out.println("BST中最小值: " + MIN(root));
        //打印root的值
        System.out.println("BST root的值: " + root.val);
        //前序遍历BST
        //preOrderTraversal(root);
        preOrderTraversal(root);
        preOrderTraversalWithoutRecursive(root);
        System.out.println("BST前序遍历：" + list);
        //后序遍历BST
        //postOrderTraversal(root);
        //System.out.println("BST后序遍历：" + list);


    }
    //二叉树的递归前序遍历
    public static void preOrderTraversal(TreeNode root){
        if(root == null) return;
        list.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
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
    //二叉树的递归后序遍历
    public static void postOrderTraversal(TreeNode root){
        if(root == null){ return;}
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        list.add(root.val);
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
    public static void maintainBST(TreeNode node, TreeNode root){
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
    //查找BST中的最大数
    public static int MAXSUM(TreeNode root){
        if(root == null) return -Integer.MAX_VALUE;
        int max = 0;
        while(root != null){
            max = root.val;
            root = root.right;
        }
        return max;
    }
    //查找BST中的最小数
    public static int MIN(TreeNode root){
        if(root == null){ return -Integer.MAX_VALUE;}
        int min = 0;
        while(root != null){
            min = root.val;
            root = root.left;
        }
        return min;
    }
    //BST非递归前序遍历
    public static void preOrderTraversalWithoutRecursive(TreeNode root){
        if(root == null){ return;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null){ stack.push(node.right);}
            if(node.left != null){ stack.push(node.left);}
        }
    }
    //BST非递归中序遍历
    public static void inOrderTraversalWithoutRecursive(TreeNode root){
        if(root == null){return ;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null){ stack.push(node.right);}
            if(node.left != null){ stack.push(node.left);}
        }

    }


}

