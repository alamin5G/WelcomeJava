package Chapter_10;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackOfIntegers {
    private int[] elementSize;
    private int size;

    StackOfIntegers(){
        elementSize = new int[10];
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
       if(size == elementSize.length){
           int[] newArray = new int[elementSize.length * 2];
           System.arraycopy(elementSize, 0, newArray, 0, elementSize.length);
           elementSize = newArray;
       }
        elementSize[size++] = element;
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
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(21);
        st.push(22);
        System.out.println("Printing stack elements");
        st.printStack();
        System.out.println("Stack Size : " + st.getSize());
        System.out.println("\nPeeking element : " + st.peek() );
        System.out.println("\nPopped element : " + st.pop());

        System.out.println("\nPeeking element : " + st.peek() );

        System.out.println("\nPopped element : " + st.pop());

        System.out.println("Printing stack elements");
        st.printStack();

    }
}
