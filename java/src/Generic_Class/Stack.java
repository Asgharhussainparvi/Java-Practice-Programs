package Generic_Class;

public class Stack<T> {
    private T[] stack;
    private int top;

    public Stack(int size) {
        stack = (T[]) new Object[size];
    }

    public void push(T item) {
        if (top < stack.length - 1) {
            stack[++top] = item;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public T pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
            return null;
        }
    }

    public T peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Stack: \n Peek:" + intStack.peek() + ", Pop1:" + intStack.pop() + ", Pop2: " + intStack.pop() + ", ");
        System.out.println("After popping out :");
        System.out.println("Peek :"+ intStack.peek() + ", Pop :" + intStack.pop());

        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Stack: \n Peek:" + stringStack.peek() + ", Pop:" + stringStack.pop() );
        System.out.println("After popping out :");
        System.out.println(stringStack.peek() );
    }

}
