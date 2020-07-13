package com.yunkan.model;


/**
 * @author foreverActiveBoy
 * @date 2020/7/4 15:43
 * @apiNote 动态数组
 */
public class Array<E> {
    /**
     * 存储的数据
     */
    private E[] data;
    /**
     * 数组中元素个数
     */
    private int size;

    /**
     *
     * @param capacity 数组初始化容积
     */
    public Array(int capacity){
        data = (E[])new Object[capacity];
    }

    /**
     * 无参构造
     *初始化数组容积为10
     */
    public Array(){
       this(10);
    }

    /**
     * 获取数组的容积
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 获取元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断数组是不是为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向指定位置添加元素e
     * @param index 指定索引
     * @param e 元素
     */
    public void add(int index,E e){
        //  参数校验
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }
        //  如果数组容量不够，则扩容
        if (size == data.length){
            data = resize(2 * data.length);
        }
        //  将index后面的元素后移
        for (int i = size-1; i >= index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 改变容量函数
     * @param newCapacity 数组新容量
     * @return 改容之后的数组
     */
    private E[] resize(int newCapacity){
        E[] newArray = (E[])new Object[newCapacity];
        //  将原数组中的数据拷贝到新数组中
        for (int i = 0; i < size; i++){
            newArray[i] = data[i];
        }
        return newArray;
    }

    /**
     * 向数组最后添加元素
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 向数组最前面添加一个元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 获取inidex位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }

    /**
     * 修改index位置元素
     * @param index
     * @param e
     */
    public void set(int index,E e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Index is illegal");
        }
        data[index] = e;
    }

    /**
     * 判断数组中是否包含e
     * @param e
     * @return
     */
    public boolean contains(E e){
        for (int i = 0; i < size;i++){
            if (e.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找元素的索引
     * @param e
     * @return
     */
    public int find(E e){
        for (int i = 0;i < size;i++){
            if(e.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public E remove(int index){
        //  参数校验
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("remove failed. Index is illegal");
        }
        for (int i = index;i < size-1;i++){
            data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
        if (size == data.length/4 && data.length/2 != 0){
            data = resize(data.length/2);
        }
       return  data[index];
    }

    /**
     * 删除第一个元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public E removeLast(){
        return remove(size-1);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
            buffer.append(String.format("数组中的元素个数size：%d and 容量capacity:%d",size,data.length)+"\t [");
        for (int i = 0;i< size-1;i++){
            buffer.append(data[i]+",");
        }
        buffer.append(data[size-1]+"]");
        return buffer.toString();
    }
}
