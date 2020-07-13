package com.yunkan.test;

import com.yunkan.model.ArrayQueue;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:55
 * @apiNote
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enQueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.deQueue();
                System.out.println(queue);
            }
        }
    }
}
