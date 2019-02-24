
/**
 * Test data structures
 * @author Zhenhua.Yang.1
 */

public class Client {
    public static void main(String[] args) {
        
        // create Arrays to store titles and headers for the table
        String[] titles = new String[4];
        String[] header1 = {"N", "push(nsec)", "pop(nsec)"};
        String[] header2 = {"N", "enqueue(nsec)", "dequeue(nsec)"};
        titles[0]="ArrayStack Test";
        titles[1]="LinkedStack Test";
        titles[2]="ArrayQueue Test";
        titles[3]="LinkedQueue Test";
        long[][] data = new long[7][3];     // 2-D array that save calculated data.
        
        int n = 10;
        /** Test ArrayStack */
        ArrayStack <Integer> stackArr = new ArrayStack<>(); // create new ArrayStack object
        
        for(int i = 0; i < data.length; i++ ){
             
            long startTime = System.nanoTime();
            repeatPush_as(stackArr, 1, n);          // repeatly push data to the ArrayStack for n times.
            long endTime = System.nanoTime();
            long elapsed = endTime - startTime;     // calculate the elapsed time.

            long startTime2 = System.nanoTime();
            repeatPop_as(stackArr, n);              // repeatly pop data from the ArrayStack for n times.
            long endTime2 = System.nanoTime();
            long elapsed2 = endTime2 - startTime2;  // calculate the elapsed time.

            data[i][0] = n;                 // add n to the row i of the data array
            data[i][1] = elapsed;           // add elapsed time of push() to the row i of the data array
            data[i][2] = elapsed2;          // add elapsed time of pop() to the row i of the data array

            n = n * 10;                     // multiplied n by 10;
        }
        
        printASCII(titles[0], header1, data);
       
        
        /** Test LinkedStack */
        
        LinkedStack <Integer> stackLink = new LinkedStack<>();
        n = 10;
        for(int i = 0; i < data.length; i++ ){
             
            long startTime = System.nanoTime();
            repeatPush_ls(stackLink, 1, n);             // repeatly push data to the LinkedStack for n times.
            long endTime = System.nanoTime();
            long elapsed = endTime - startTime;         // calculate the elapsed time.

            long startTime2 = System.nanoTime();
            repeatPop_ls(stackLink, n);                 // repeatly pop data from the LinkedStack for n times.
            long endTime2 = System.nanoTime();
            long elapsed2 = endTime2 - startTime2;  // calculate the elapsed time.

            data[i][0] = n;                 // add n to the row i of the data array
            data[i][1] = elapsed;           // add elapsed time of push() to the row i of the data array
            data[i][2] = elapsed2;          // add elapsed time of pop() to the row i of the data array

            n = n * 10;                     // multiplied n by 10;
        }
        
        printASCII(titles[1], header1, data);
        
        /** Test ArrayQueue */
        ArrayQueue <Integer> queueArr = new ArrayQueue<>();
        
        n = 10;
        for(int i = 0; i < data.length; i++ ){
             
            long startTime = System.nanoTime();
            repeatEnqueue_aq(queueArr, 1, n);           // repeatly enqueue data to the ArrayQueue for n times.
            long endTime = System.nanoTime();
            long elapsed = endTime - startTime;         // calculate the elapsed time.

            long startTime2 = System.nanoTime();
            repeatDequeue_aq(queueArr, n);              // repeatly dequeue data from the ArrayQueue for n times.
            long endTime2 = System.nanoTime();
            long elapsed2 = endTime2 - startTime2;  // calculate the elapsed time.

            data[i][0] = n;                 // add n to the row i of the data array
            data[i][1] = elapsed;           // add elapsed time of enqueue() to the row i of the data array
            data[i][2] = elapsed2;          // add elapsed time of dequeue() to the row i of the data array

            n = n * 10;                     // multiplied n by 10;
        }
        
        printASCII(titles[2], header2, data);

        
        /** Test LinkedQueue */

        LinkedQueue <Integer> queueLink = new LinkedQueue<>();
        
        n = 10;
        for(int i = 0; i < data.length; i++ ){
             
            long startTime = System.nanoTime();
            repeatEnqueue_lq(queueLink, 1, n);          // repeatly push data to the LinkedQueue for n times.
            long endTime = System.nanoTime();
            long elapsed = endTime - startTime;         // calculate the elapsed time.

            long startTime2 = System.nanoTime();
            repeatDequeue_lq(queueLink, n);             // repeatly dequeue data from the LinkedQueue for n times.
            long endTime2 = System.nanoTime();
            long elapsed2 = endTime2 - startTime2;  // calculate the elapsed time.

            data[i][0] = n;                 // add n to the row i of the data array
            data[i][1] = elapsed;           // add elapsed time of enqueue() to the row i of the data array
            data[i][2] = elapsed2;          // add elapsed time of dequeue() to the row i of the data array

            n = n * 10;                     // multiplied n by 10;
        }
        
        printASCII(titles[3], header2, data);
        
        
        /** Test ArrayList */ 
        String listFormat = "|  %12s  |  %12s  |  %12s  |\n";
        System.out.println("+--------------------------------------------------+\n"
                        + "|                  ArrayList Test                  |\n"
                        + "+----------------+----------------+----------------+\n"
                        + "|     Method     |  Return Value  |  List Contents |\n"
                        + "+----------------+----------------+----------------+");
        ArrayList<Character> listArr = new ArrayList<>();
        listArr.add(0, 'A');
        System.out.printf(listFormat, "add(0, A)", "-", listArr.toString());
        listArr.add(0, 'B');
        System.out.printf(listFormat, "add(0, B)", "-", listArr.toString());

        System.out.printf(listFormat, "get(1)", listArr.get(1), listArr.toString());
        try{
            listArr.set(2, 'C');
            System.out.printf(listFormat, "set(2, C)", "-", listArr.toString());
        }catch(IndexOutOfBoundsException ex){
            System.out.printf(listFormat, "set(2, C)", "\"error\"", listArr.toString());
        }
        
        listArr.add(2, 'C');
        System.out.printf(listFormat, "add(2, C)", "-", listArr.toString());
        
        try{
            listArr.add(4, 'D');
            System.out.printf(listFormat, "add(4, D)", "-", listArr.toString());
        }catch(IndexOutOfBoundsException ex){
            System.out.printf(listFormat, "add(4, D)", "\"error\"", listArr.toString());
        }
        
        System.out.printf(listFormat, "reomve(1)", listArr.remove(1), listArr.toString());
        
        listArr.add(1, 'D');
        System.out.printf(listFormat, "add(1, D)", "-", listArr.toString());
        listArr.add(1, 'E');
        System.out.printf(listFormat, "add(1, E)", "-", listArr.toString());
        
        try{
            listArr.get(4);
            System.out.printf(listFormat, "get(4)", "-", listArr.toString());
        }catch(IndexOutOfBoundsException ex){
            System.out.printf(listFormat, "get(4)", "\"error\"", listArr.toString());
        }
        
        listArr.add(4, 'F');
        System.out.printf(listFormat, "add(4, F)", "-", listArr.toString());
        
        System.out.printf(listFormat, "set(2,G)", listArr.set(2,'G'), listArr.toString());
        System.out.printf(listFormat, "get(2)", listArr.get(2), listArr.toString());
        
        System.out.println("+--------------------------------------------------+\n");
        
        
        
        
    }
    
     public static void repeatPush_as(ArrayStack list,int num, int n){
        for(int i = 0; i < n; i++){
            list.push(num);
        }
    } 
     
     public static void repeatPop_as(ArrayStack list,int n){
        for(int i = 0; i < n; i++){
            list.pop();
        }
    }
     
     public static void repeatPush_ls(LinkedStack list,int num, int n){
        for(int i = 0; i < n; i++){
            list.push(num);
        }
    } 
     
     public static void repeatPop_ls(LinkedStack list,int n){
        for(int i = 0; i < n; i++){
            list.pop();
        }
    }
     
     public static void repeatEnqueue_aq(ArrayQueue list,int num, int n){
        for(int i = 0; i < n; i++){
            list.enqueue(num);
        }
    } 
     
     public static void repeatDequeue_aq(ArrayQueue list,int n){
        for(int i = 0; i < n; i++){
            list.dequeue();
        }
    }
     
    public static void repeatEnqueue_lq(LinkedQueue list,int num, int n){
        for(int i = 0; i < n; i++){
            list.enqueue(num);
        }
    } 
     
    public static void repeatDequeue_lq(LinkedQueue list,int n){
        for(int i = 0; i < n; i++){
            list.dequeue();
        }
    }
     
     
     
    public static void printASCII(String title, String[] header, long [][] data){
        
        int longest = Long.toString(data[data.length-1][1]).length() + 6;
        
        printHr(longest);
        
        String headerFormat = "|  %" + longest + "s  |  %" + longest + "s  |  %" + longest + "s  |\n";
        String dataFormat = "|  %," + longest + "d  |  %," + longest + "d  |  %," + longest + "d  |\n";
        String titleFormat = "|  %" + longest + "s     %" + longest + "s     %" + longest + "s  |\n";
        System.out.printf(titleFormat, " ", title, " ");
        
        printHr(longest);
        System.out.printf( headerFormat, header[0], header[1], header[2]);
        printHr(longest);
        
        for( int i = 0; i < data.length; i++ ){
            System.out.printf( dataFormat, data[i][0], data[i][1], data[i][2] );
        }
        
        printHr(longest);
        System.out.println("\n\n");
        
    }
     
     public static void printHr(int maxNum){
        
        String str = "+";
        for(int i = 0; i < (maxNum*3+14); i++){
            str += "-";
        }
         System.out.println(str + "+");
     }
    
}
