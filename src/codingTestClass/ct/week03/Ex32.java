package codingTestClass.ct.week03;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Deque : 앞뒤로 넣었다 뺐다 할 수 있는 자료구조
 *그래서 first .랑 last 가 있는것을 제외하고 다 같음
 *
 * */
public class Ex32 {
    public static void main(String[] args) {
        Deque<Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.offer(3);
        System.out.println(que.toString());
        que.addFirst(0); // 앞에 새로운 객체를 넣을 때 사용
        System.out.println(que.toString());
        System.out.println(que.peek());

    }
}
