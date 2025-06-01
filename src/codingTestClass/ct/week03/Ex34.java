package codingTestClass.ct.week03;

import java.util.Arrays;
import java.util.Scanner;

//배열과 queue
public class Ex34 {
    public static void main(String[] args) {
        //add poll peek clear print exit
        //ArrayQueue를 호출해서 쓸 예정
        ArrayQueue aq = new ArrayQueue(5);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("1.add, 2.peek, 3.poll, 4.clear, 5.print, 0.exit  : ");
            int n = sc.nextInt();
            if(n ==0) break;
            switch (n){
                case 1:
                    int m = sc.nextInt();
                    aq.add(m);
                    break;
                case 2:
                    System.out.println(aq.peek());
                    break;
                case 3:
                    System.out.println(aq.poll());
                    break;
                case 4:
                    aq.clear();
                    break;
                case 5:
                    aq.print();
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

}
class ArrayQueue{
    private int[] queue; //큐
    private int max; // queue 의 최대용량
    private int front; //배열 맨 앞 커서
    private int rear; //배열 맨 뒤 커서
    private int cnt; //현재 데이터 수

    public ArrayQueue(int max) {
        this.max = max;
        this.front = this.rear = this.cnt = 0;
        this.queue = new int[max];
    }

    public void add(int n){
        if(cnt >=max){
            System.out.println("Queue is Full");
        }else{
            //큐에 담는다
            queue[rear++] = n;
            //cnt를 증가시킨다
            cnt++;
            //rear == max이면 rear는 0이다
            if(rear == max) rear = 0;
            System.out.println("입력데이터 : " + n);

        }
        //return true;
    }

    public int peek(){
        if(cnt <= 0){
            System.out.println("queue is Empty");
            return -9999;
        }
        return queue[front];
    }

    public int poll(){
        if(cnt <= 0){
            System.out.println("queue is Empty");
            return -9999;
        }
        //개수를 줄인다
        //front와 max가 같으면 front는 0이다
        cnt --;
        if(cnt <= 0) cnt = 0;
        if(front>=max) front = 0;
        return queue[front++];
    }

    public void clear(){

        this.front = this.rear = this.cnt = 0;
        this.queue = new int[max];

    }
    public void print(){
        if(cnt<=0){
            System.out.println("queue is empty");
        }else{
            System.out.println(Arrays.toString(queue));
        }

    }
}