package b_2018;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        int start = 1, end = 1, sum = 1, count = 0;
        while(start <= N){
            if(sum == N){
                count++;
                sum -= start;
                start++;

            }else if(sum<N){
                sum += end;
                end++;
            }else{
                sum -= start;
                start++;

            }

        }

    }
}
