public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for (int i = 0 ; i < 10 ; i ++){
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue);

            if(i % 3 == 2){
                arrayQueue.dequeue();
                System.out.println(arrayQueue);
            }
        }
    }
}
