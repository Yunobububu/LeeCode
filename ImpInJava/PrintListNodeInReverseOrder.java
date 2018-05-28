package Leecode.ImpInJava;

import java.util.Stack;

public class PrintListNodeInReverseOrder {
    public static void main(String[] args){
        int[] array = {3,5,2,1,9};
        ListNode head = ListNode.buildList(array);
        //printInReverseOrder(head);
        printRecursive(head);
    }
    //显式用栈模拟递归方法反向打印数组
    public static void printInReverseOrder(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().val);
        }
    }
    //递归反向打印链表
    public static void printRecursive(ListNode head){
        if(head == null){return;}
        printRecursive(head.next);
        System.out.println(head.val);
    }

}
