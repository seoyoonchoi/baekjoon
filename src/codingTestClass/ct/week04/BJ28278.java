package codingTestClass.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
           int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 5:
                    if(stack.isEmpty()) System.out.println(-1);
                    else stack.peek();
                    break;
            }
        }

    }
}
