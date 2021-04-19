public class myStack2<T> {
    public static final int DEFAULT_CAPACITY = 10;
    public int size;
    public T[] element;


    public myStack2() {
        this.element = (T[]) new Object[10];
    }

    public void push(T e) {
        if (size >= DEFAULT_CAPACITY) {
            System.out.println("Stack is full");
        } else {
            element[size++] = e;

        }
    }

    public T pop() {
        if (size <= 0) {
            System.out.println("Stack is null");
        }
        T temp = element[size - 1];
        element[size - 1] = null;
        size = size - 1;
        return temp;
    }
    public T peek() {
        if (size <= 0) {
            System.out.println("Stack is null");
        }
        T temp = element[size - 1];
        return temp;
    }



    public void display(){
        for ( int i = 0 ; i< size ; i++ ){
            System.out.println(element[i]);
        }
    }


}
