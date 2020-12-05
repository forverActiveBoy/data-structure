package com.yunkan.model;


/**
 * @author foreverActiveBoy
 * @date 2020/7/18 11:17
 * @apiNote 链表
 */
public class LinkedList<E> {
    /**
     * 虚拟头节点
     */
    private Node dummyHead;
    /**
     * 链表元素个数
     */
    private int size;

    /**
     * 无参构造
     */
    public LinkedList(){
        this.dummyHead = new Node();
        this.size = 0;
    }

    /**
     * 链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 链表元素个数
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 向指定的位置添加元素
     * 找到index位置的前一个元素，移动指针
     * @param index
     * @param e
     */
    public void add(int index,E e){
        //  参数校验
        if (index <0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prevNode = dummyHead;
        for (int i = 0;i < index;i ++){
           prevNode = prevNode.next;
        }
        Node node = new Node(e,prevNode.next);
        prevNode.next = node;
        size ++;
    }

    /**
     * 向链表头添加元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 向链表尾添加元素
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     *删除对应位置的元素
     * @param index
     */
    public void remove(int index){
        //  参数校验
        if (index <0 || index > size){
            throw new IllegalArgumentException("remove failed. Illegal index.");
        }
        Node prevNode = dummyHead;
        for (int i = 0; i < index ;i ++){
           prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size -- ;
    }

    /**
     * 删除第一个元素
     */
    public void removeFirst(){
        remove(0);
    }

    /**
     * 删除最后一个元素
     */
    public void removeLst(){
        remove(size - 1);
    }

    /**
     * 删除元素e
     * @param e
     */
    public void removeElement(E e){
        Node prevNode = dummyHead;
        while (prevNode != null){
            if (prevNode.next.e.equals(e)){
               break;
            }
            prevNode = prevNode.next;
        }
        if (prevNode.next != null){
            prevNode.next = prevNode.next.next;
            size -- ;
        }
    }

    /**
     * 修改index位置的元素
     * @param index
     * @param e
     */
    public void set(int index,E e){
        //  参数校验
        if (index <0 || index > size){
            throw new IllegalArgumentException("set failed. Illegal index.");
        }
        Node prevNode = dummyHead;
        for (int i = 0; i < index ;i ++){
            prevNode = prevNode.next;
        }
        prevNode.next = new Node(e);
    }

    /**
     * 判断是否包含元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node prevNode = dummyHead;
        while (prevNode != null){
            if (prevNode.next.e.equals(e)){
                return true;
            }
            prevNode = prevNode.next;
        }
        return false;
    }

    /**
     * 获取index位置的元素
     * @param index
     * @return
     */
    private E get(int index){
        //  参数校验
        if (index <0 || index > size){
            throw new IllegalArgumentException("set failed. Illegal index.");
        }
        Node prevNode = dummyHead;
        for (int i = 0; i <= index ;i ++){
            prevNode = prevNode.next;
        }
        return prevNode.next.e;
    }

    /**
     * 获取第一个元素的值
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个元素的值
     * @return
     */
    public E getLast(){
        return get(size - 1);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (LinkedList.Node curcurrentNode = dummyHead.next; curcurrentNode != null; curcurrentNode = curcurrentNode.next){
           builder.append(curcurrentNode + "->");
        }
        builder.append("NULL");
        return builder.toString();
    }

    /**
     * 节点对象
     */
    private class Node{
        /**
         * 实际存储的数据
         */
        private E e;
        /**
         * 下一个节点对象
         */
        private Node next;

        /**
         * 无参构造
         */
        public Node(){
            this(null,null);
        }

        /**
         * 只传数据
         * @param e
         */
        public Node(E e){
            this(e,null);
        }

        /**
         * 全参构造
         * @param e
         * @param next
         */
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }
}
