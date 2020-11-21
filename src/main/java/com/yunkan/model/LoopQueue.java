package com.yunkan.model;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 21:04
 * @apiNote 循环队列
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front, tail;
    private int size;

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enQueue(E e) {

    }

    @Override
    public E deQueue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
