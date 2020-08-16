/**
 * @author 孔维一
 * @date 2020/8/15 6:49
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0 ; i < 5 ; i ++){
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        arrayStack.pop();
        System.out.println(arrayStack);
    }
}
