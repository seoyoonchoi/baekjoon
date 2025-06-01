package beakjoon.b_1940;


//런타임 에러 발생
/*
런타임 에러 발생 이유
end 범위가 초과할 수 있어서
코드 수정 후에도 틀림 => 문제가 두 수의 합이 M이 되는 경우를 구하는 것인데 여러개를 합했을때의 관계로 잘못 해석함

코드 수정 => Main
* */

import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int start=0,end=0, sum=0;
        //while(start<N){ =>런타임 에러 발생
        while(start<N && end<N){
            if(M==sum){
                count++;
                sum -= arr[start];
                start++;

            }else if(sum<M){
                sum += arr[end];
                end++;

            }else{
                sum -= arr[start];
                start++;
            }

        }
        System.out.println(count);
    }
}
