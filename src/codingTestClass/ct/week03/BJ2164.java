package codingTestClass.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qu = new LinkedList<>();
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            qu.add(i);
        }

        while(qu.size()>1){
            qu.poll();
            qu.add(qu.poll());
        }
        System.out.println(qu.poll());



    }
}
