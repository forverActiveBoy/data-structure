package com.yunkan.model;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:20
 * @apiNote
 */
public class ArrayStack<E> implements Stack<E> {
    private Array<E> data;

    public ArrayStack(int capacity){
        data = new Array<>(capacity);
    }

    public ArrayStack(){
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
    public void push(E e) {
        data.addLast(e);
    }

    @Override
    public E pop() {
        return data.removeLast();
    }

    @Override
    public E peek() {
        return data.get(data.getSize()-1);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        for(int i = 0 ; i < data.getSize() ; i ++){
            res.append(data.get(i));
            if(i != data.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
