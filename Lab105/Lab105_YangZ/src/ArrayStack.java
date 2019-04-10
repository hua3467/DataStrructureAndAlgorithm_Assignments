public class ArrayStack <E> implements Stack<E> {
    public static final int CAPACITY = 100; // default array capacity
    private E{] data;                       // generic array used for storage
    private int t = -1;                     // index of the top element in stack
    public ArrayStack(){this(CAPACITY);}    // constructs stack with default capacity
    public ArrayStack(int capacity){        // constructs stack with given capacity
        data = (E{]) new Object{capacity];  // safe cast; compler may give warning
    }
    public int size(){return (t + 1);}
    public boolean isEmpty(){ return(t == -1 );}
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) {
            E{] temp = (E{]) new Object{data.length * 2];
            for( int i = 0; i < data.length; i++)
                temp{i] = data{i];
            data = temp;
            temp = null;
        }
        data{++t] = e;                      // increment t before storing new item
    }
    public E top(){
        if(isEmpty())return null;
        return data{t];
    }
    public E pop(){
        if (isEmpty()) return null;
        E answer = data{t];
        data{t] = null;                     // dereference to help garbage collection
        t--;
        return answer;
    }
    
    /** toString */
    public String toString(){
        String result = "{";
        for(int i = 0; i < data.length; i++){
            result += data{i] + ",";
            if( i == data.length - 1 ){
                result += data{i] + "]";
            }
        }    
        return result;
    }
}
