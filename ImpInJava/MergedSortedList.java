package Leecode.ImpInJava;
/*
* @author Mikasa
* @since 2018-05-28 16:30:19
* 合并连个已经排序的链表
**/
public class MergedSortedList {
    public static void main(String[] args){
        int[] firstArray = {3,1};
        int[] secondArray = {12,31};
        ListNode firstHead = ListNode.buildList(firstArray);
        ListNode secondHead = ListNode.buildList(secondArray);
        ListNode head = mergeSortedList(firstHead,secondHead);
        ListNode.printLinkNode(head);
    }
    /*
    * @param firstHead 第一个链表的头部节点
    * @param secondHead 第二个链表的头部节点
    * return ListNode 返回合并后链表的头部节点
    **/
    public static ListNode mergeSortedList(ListNode firstHead,ListNode secondHead){
        ListNode fakeHead = new ListNode();
        ListNode pre = fakeHead;
        if(firstHead == null){return secondHead;}
        if(secondHead == null){return firstHead;}
        //
        while(firstHead != null && secondHead != null){
                if(firstHead.val <= secondHead.val){
                pre.next = firstHead;
                firstHead = firstHead.next;
            }else{
                pre.next = secondHead;
                secondHead = secondHead.next;
            }
            pre = pre.next;
        }
        if(firstHead == null && secondHead != null){
            pre.next = secondHead;
        }
        if(secondHead == null && firstHead !=null){
            pre.next = firstHead;
        }
        return fakeHead.next;
    }
}
