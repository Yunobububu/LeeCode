package Leecode.ImpInJava;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int x){ val = x;}
    //数组转换为链表
    public static ListNode buildList(int[] array){
        if(array == null || array.length == 0){return null;}
        ListNode fakeHead = new ListNode(-1);
        ListNode cur = new ListNode();
        ListNode pre = fakeHead;
        for(int i = 0;i < array.length;i++){
            cur = new ListNode(array[i]);
            pre.next = cur;
            pre = cur;
        }
        return fakeHead.next;
    }
    //遍历链表的元素
    public static void printLinkNode(ListNode head){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        while(head != null){
            System.out.print(head.val+ " ");
            head = head.next;
        }

    }
}
