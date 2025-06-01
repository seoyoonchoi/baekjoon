package codingTestClass.ct.week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex31 {
    /*
     * Queue
     *
     * */
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        //new queue 가 아닌 LinkedList를 써줘야함
        que.add(1);
        que.add(2);
        que.offer(3);//return이 성공하면 true 반환
        que.offer(4);
        System.out.println(que.toString());//출력 : [1,2,3,4]
        System.out.println(que.peek());//맨 앞에 있는 녀석을 갖고오며 제거하지 않는다
        que.poll();//맨 앞에 있는 녀석을 제거한다
        System.out.println(que.toString());
        System.out.println(que.size());
        System.out.println(que.isEmpty());
        System.out.println(que.remove(4));//안에 들어가 있는것은 인덱스 번호가 아니라 해당 값이다.(객체명이다)
        System.out.println(que.toString());
        que.clear();//que에 있는 것을 모두 제거한다.

    }
}
