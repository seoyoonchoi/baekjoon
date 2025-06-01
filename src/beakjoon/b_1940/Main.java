package beakjoon.b_1940;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        int count = 0;
        while(start<end){
            if(M == arr[start]+arr[end]){
                count++;
                start++;
                end--;
            }else if(M < arr[start]+arr[end]){
                end --;
            }else{
                start ++;
            }
        }
        System.out.println(count);
    }
}
