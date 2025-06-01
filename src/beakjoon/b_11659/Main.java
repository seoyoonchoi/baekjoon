package beakjoon.b_11659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int[] acc = new int[N+1];

        for(int i = 1; i<N+1; i++){
            arr[i] = sc.nextInt();
            acc[i] = acc[i-1]+arr[i];

        }

        for(int i = 0; i<M; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(acc[q]-acc[p-1]);

        }


    }
}
