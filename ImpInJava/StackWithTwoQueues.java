package Leecode.ImpInJava;

import java.util.PriorityQueue;
import java.util.Queue;
/*
* 用两个队列实现栈结构
* 队列:FIFO
* 栈:LIFO
* 本算法可以采用两水管来类比
* 两个链表可以看做用来放数据的水管
* push时看做往容器里加水,判断哪个水管非空则把水加入
* pop时,判断哪个链表(水管)非空,循环pop并被在另一个链表push,直到最后一个元素即为要pop的元素
* @author Mikasa
* @since 2018-05-29 08:07:38
* version Aim@Offer 7p
**/
public class StackWithTwoQueues<E> {
    private Queue<E> firstQueue = new PriorityQueue<>();
    private Queue<E> secondQueue = new PriorityQueue<>();

    public E pop() throws Exception {
        if(isEmpty()) throw new Exception("栈为空");
        //队列的最后一个元素,也就是要弹出的栈顶元素
        E head;
        if(!firstQueue.isEmpty()){
            while(firstQueue.size() > 1){
                secondQueue.offer(firstQueue.poll());
            }
             head = firstQueue.poll();
        }else{
            while(secondQueue.size() > 1){
                firstQueue.offer(secondQueue.poll());
            }
             head = secondQueue.poll();
        }
        return head;
    }
    //入栈
    public void push(E elem){
        if(!firstQueue.isEmpty()){
            firstQueue.offer(elem);
        }else secondQueue.offer(elem);
    }

    public boolean isEmpty(){
        if(firstQueue.isEmpty() && secondQueue.isEmpty()) return true;
        return false;
    }
}
