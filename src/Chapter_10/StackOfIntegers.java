package Chapter_10;

import java.util.EmptyStackException;

public class StackOfIntegers {
    private int[] elementSize;
    private int size;

    StackOfIntegers(){
        elementSize = new int[16];
    }

    public StackOfIntegers(int capacity) {
        elementSize = new int[capacity];

    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public void push(int element){
        elementSize[size] = element;
        size++;
    }
    public int pop(){
        if(size == 0){
            throw new EmptyStackException();
        }else{
            int element = elementSize[size-1];
            elementSize[--size] = 0;
            return element;
        }
    }

    public int peek(){
        if(size == 0){
            throw new EmptyStackException();
        }else{
            return elementSize[size - 1];
        }
    }

    public void printStack(){
        for(int i = size-1; i >= 0; i--){
            System.out.print(elementSize[i] + " ");
        }
    }
}

class StackImpl {
    public static void main(String[] args) {
        StackOfIntegers st = new StackOfIntegers();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Printing stack elements");
        st.printStack();
        System.out.println("\nPeeking element : " + st.peek() );
        System.out.println("\nPopped element : " + st.pop());

        System.out.println("\nPeeking element : " + st.peek() );

        System.out.println("\nPopped element : " + st.pop());

        System.out.println("Printing stack elements");
        st.printStack();

    }
}
