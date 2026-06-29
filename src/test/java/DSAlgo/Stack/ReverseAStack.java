package DSAlgo.Stack;
import java.util.Stack;

public class ReverseAStack {

    public static Stack<Integer> reverseStackToNewEmptyStack(Stack<Integer> existingStack, Stack<Integer> newEmptyStack){
        while (!existingStack.empty()){
            int val = existingStack.peek();
            newEmptyStack.push(val);
            existingStack.pop();
        }
        return newEmptyStack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        stack1.push(9);
        stack1.push(6);
        stack1.push(4);
        System.out.println(stack1);
        System.out.println(reverseStackToNewEmptyStack(stack1, stack2));
        System.out.println(reverseStackToNewEmptyStack(stack2, stack3));
        reverseStackToNewEmptyStack(stack3,stack1);
        System.out.println("Reversed the first stack ---> "+stack1);
    }
}
