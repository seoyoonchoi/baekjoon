package codingTestClass.ct.week04;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(String.format("%d / %d", stack.size(), stack.capacity()));//들어간 것의 값(top) stack 에 들어가는 횟수
            System.out.print("1. push, 2. peek, 3.pop, 4. clear, 5. print, 0.exit : ");
            int n = sc.nextInt();
            if(n == 0) break;// System.exit(0)을 넣어도 무방.
            switch(n){
                case 1:
                    System.out.print("push : ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    System.out.print("peek : ");
                    stack.peek();
                    break;
                case 3:
                    System.out.print("pop : ");
                    stack.pop();
                    break;
                case 4:
                    System.out.print("clear : ");
                    stack.clear();
                    break;
                case 5:
                    System.out.print("print : ");
                    stack.print();
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;
            }

        }
    }
}

class ArrayStack{
    private Object stack[];
    private int top;
    private int max;

    public ArrayStack(int max){
        this.max = max;
        this.top = 0;
        stack = new Object[max];
    }

    public void push(Object obj){
        if (top > max) {
            System.out.println("Stack is Full!");
        }else{
            stack[top++] = obj;
        }
    }

    public Object peek(){
        if(top <=0){
            System.out.println("Stack is Empty!");
            return null;
        }

        return stack[top-1];
    }

    public Object pop(){
        if(top <=0){
            System.out.println("Stack is Empty!");
            return null;
        }else{
            Object obj = stack[top-1];
            stack[top-1] = null;
            top --;
            return obj;
        }
    }

    public void clear(){
        this.top = 0;
        stack = new Object[this.max];


    }

    public void print(){
        for(Object obj : stack){
            if(obj != null){
                System.out.print(String.format("%s ", obj.toString()));

            }
        }
        System.out.println();
    }

    public int size(){
        return this.top;
    }

    public int capacity(){
        return this.max;
    }



}
