package com.yunkan.model;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:42
 * @apiNote 对列接口
 */
public interface Queue<E> {
    /**
     * 获取队列元素个数
     * @return
     */
    int getSize();

    /**
     * 判断队列是不是为空
     * @return
     */
    boolean isEmpty();

    /**
     * 入队
     * @param e
     */
    void enQueue(E e);

    /**
     * 出队
     * @return
     */
    E deQueue();

    /**
     * 获取队首元素
     * @return
     */
    E getFront();
}
