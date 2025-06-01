package codingTestClass.ct.week03;

import java.util.PriorityQueue;

//Priority Queue
public class Ex33 {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        //숫자나 문자 중에서 먼저인 것을 가져오겠다, 이진트리구조
        que.offer(3);
        que.offer(5);
        que.offer(2);
        que.offer(1);
        que.offer(8);
        que.offer(4);
//        que.offer(3);
        System.out.println(que.toString());
    }
}