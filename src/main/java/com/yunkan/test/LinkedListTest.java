package com.yunkan.test;


import com.yunkan.model.LinkedList;

/**
 * @author foreverActiveBoy
 * @date 2020/7/18 17:38
 * @apiNote
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++){
            linkedList.addFirst(i);
        }
        linkedList.add(3,333);
        System.out.println(linkedList);
    }
}
