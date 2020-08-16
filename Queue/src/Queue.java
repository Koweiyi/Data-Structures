/**
 * @Author: 孔维一
 * @Data: 2020/8/15 12:15
 * @Version: 1.0.0
 */
public interface Queue<E> {
    /**
     * 向队首加入一个元素
     * @param e
     * */
    void enqueue(E e);

    /**
     * 从队首出队一个元素
     * @return E
     * */
    E dequeue();

    /**
     * 获取队首元素
     * @return E
     * */
    E getFront();

    /**
     * 获取队列中的元素个数
     * @return int
     * */
    int getSize();

    /**
     * 判断队列是否为空
     * @return boolean
     * */
    boolean isEmpty();
}
