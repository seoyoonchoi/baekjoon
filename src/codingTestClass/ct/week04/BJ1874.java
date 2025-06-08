package codingTestClass.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int top = 0;
        for(int i = 0; i<n; i++){
            int m = sc.nextInt();
            if(m > top){
                for(int j = top+1; j<=m; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }top = m;
            }else if (m !=stack.peek()){
                System.out.println("No");
                return;
            }stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb.toString());
    }
}
