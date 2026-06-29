package javaPrograms;

public class StackUsingArray {
    private int[] stack;
    private int capacity;
    private int top;

    public StackUsingArray(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if (top == capacity -1){
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = value;
        System.out.println(value+" Pushed into stack");
    }

    public int pop(){
        if (top == -1){
            System.out.println("stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if (top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if (top == -1){
            System.out.println("stack is empty");
            return;
        }
        for (int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackObject = new StackUsingArray(5);

        stackObject.push(10);
        stackObject.push(20);
        stackObject.push(30);

        System.out.println("Top element: " + stackObject.peek());

        System.out.println("Popped: " + stackObject.pop());

        stackObject.display();
    }
}
