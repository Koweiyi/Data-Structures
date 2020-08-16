/**
 * @Author: 孔维一
 * @Data: 2020/8/15 7:01
 * @Version: 1.0.0
 */
public class ArrayStack<E> implements Stack {

    private Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(Object o) {
        array.addLast((E) o);
    }


    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i = 0 ; i < getSize() ; i ++){
            res.append(array.get(i));
            if(i != getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");

        return res.toString();
    }
}
