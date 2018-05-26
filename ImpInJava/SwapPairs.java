package Leecode.ImpInJava;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
        ListNode head = swapPairs(one);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode fakehead = new ListNode(-1);
        ListNode cur = head;
        ListNode pre = fakehead;
        fakehead.next = head;
        while((cur != null)&&(cur.next != null)){
            ListNode nextNode = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = nextNode;
            pre = cur;
            cur = nextNode;
        }
        return fakehead.next;
    }
    public static ListNode swapPairsWithRecursion(ListNode head){
        if(head == null || head.next == null){ return head;}
        ListNode  fakeHead = new ListNode(-1);
        ListNode pre  = fakeHead;
        ListNode cur = head;
        fakeHead.next = head;
        if(head != null && head.next != null){
            ListNode nextNode = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = nextNode;
            pre = cur;
            cur = nextNode;
            swapPairs(cur);
        }
        return fakeHead.next;
    }
}
