package Leecode.ImpInJava;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int x){ val = x;}
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
}
