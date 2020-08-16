/**
 * @Author: 孔维一
 * @Data: 2020/8/15 6:50
 * @Version: 1.0.0
 */
public interface Stack<E> {
    /**
     * 返回栈的元素个数
     * @return int
     */
    int getSize();

    /**
     * 判断栈是否为空
     * @return boolean
     */
    boolean isEmpty();

    /**
     * 向栈中添加一个元素
     * @param e
     */
    void push(E e);

    /**
     * 弹出栈顶元素
     * @return E
     */
    E pop();

    /**
     * 查看栈顶元素
     * @return E
     * */
    E peek();
}
