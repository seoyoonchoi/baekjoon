package codingTestClass.ct.week03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>() ;//ArrayList 아니고 LinkedList임
        for(int i = 1; i<=N; i++){
            queue.add(i);
        }
        while(queue.size()>1){
            //버린다.
            System.out.print(queue.poll()+" ");
            //뒤에 추가한다.
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());


    }
}
