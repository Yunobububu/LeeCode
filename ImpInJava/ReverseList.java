package Leecode.ImpInJava;
/*
* @author Mikasa
* since 2018-05-28 16:25:55
* Aim2Offer question 16
**/
public class ReverseList {
    public static void main(String[] args){
        int[] array = {21,33,92,12,56};
        ListNode head = ListNode.buildList(array);
        head = reverseList(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    /*
    * 实现链表翻转功能
    * 在操作链表时,链接的断链会使后序的链失联,所以一般需要先保存后面要操作的节点.
    * fakeHead,fakeTail,nextNode等
    * 本方法使用循环来实现反转,pre为操作节点的前序节点,cur为当前操作节点,nextNode为下一个操作节点
    * 首先保存nextNode = cur.next;
    * 然后断链cur.next = pre;
    * 然后pre 和cur 千亿
    * pre = cur;cur = nextNode;
    * @param ListNode head 链表的头部节点
    * @return ListNode 反转后链表的头部节点
    **/
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){ return null;}

        ListNode pre = null;
        ListNode cur = head;
        ListNode reversedHead = null;
        while(cur != null){
            ListNode nextNode = cur.next;
            if(nextNode == null){reversedHead = cur;}
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return reversedHead;
    }
}
