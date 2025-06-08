package codingTestClass.ct.week03;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class BJ1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> que = new LinkedList<>();
        int n = sc.nextInt();//총 큐의 수
        int m = sc.nextInt();//뽑을 수
        for(int i = 1; i<=n; i++){
            que.add(i);
        }
        int[] array = new int[m];
        for(int i = 0; i<m; i++){
            array[i] = sc.nextInt();
        }
        int k = 0;
        for(int arr:array){
            int idx = que.indexOf(arr);
            if(idx <que.size()/2){
                while(arr!=que.getFirst()) {
                    que.addLast(que.pollFirst());
                    k++;
                }
            }else{
                while(arr!=que.getFirst()) {
                    que.addFirst(que.pollLast());
                    k++;
                }
            }
            que.poll();
        }
        //회전수 출력
        System.out.println(k);
    }
}
