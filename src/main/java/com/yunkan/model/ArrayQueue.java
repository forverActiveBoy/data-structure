package com.yunkan.model;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:47
 * @apiNote 队列-数组实现
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> data;

    public ArrayQueue(int capacity){
        data = new Array<>(capacity);
    }

    public ArrayQueue(){
        data = new Array<>();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void enQueue(E e) {
        data.addLast(e);
    }

    @Override
    public E deQueue() {
        return data.removeFirst();
    }

    @Override
    public E getFront() {
        return data.get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < data.getSize() ; i ++){
            res.append(data.get(i));
            if(i != data.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
