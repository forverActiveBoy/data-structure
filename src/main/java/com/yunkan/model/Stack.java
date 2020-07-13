package com.yunkan.model;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:17
 * @apiNote 栈接口
 */
public interface Stack<E> {
    /**
     * 获取栈中元素个数
     * @return
     */
    int getSize();

    /**
     * 判断栈是不是为空
     * @return
     */
    boolean isEmpty();

    /**
     * 入栈
     * @param e
     */
    void push(E e);

    /**
     * 出栈
     * @return
     */
    E pop();

    /**
     * 查看栈顶元素
     * @return
     */
    E peek();
}
