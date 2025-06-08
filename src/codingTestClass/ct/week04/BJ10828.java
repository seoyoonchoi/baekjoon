package codingTestClass.ct.week04;

import javax.net.ssl.SNIHostName;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb1 = new StringBuffer();
//        StringTokenizer st = new StringTokenizer("");
        //String Builder나 StringBuffer는 그냥 String 계열이라 상관없지만 토크너라이저는 util clzss 가 필요하다.

        //append 는 뒤에 추가 prepend는 앞에 추가한다는 뜻이다.
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String s = sc.nextLine();
            String cmd = s.split(" ")[0];
            //띄어쓰기의 명령어이다
            //If문과 switch문 둘다 쓸 수 있다
            switch (cmd) {
                case "push":
                    stack.push(Integer.parseInt(s.split(" ")[1]));
                    break;
                case "pop":
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.pop());
                    stack.pop();
                    break;
                case "size":
                    stack.size();
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "top":
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
            }
        }

    }
}
