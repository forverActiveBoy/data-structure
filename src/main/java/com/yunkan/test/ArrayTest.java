package com.yunkan.test;


import com.yunkan.model.Array;

import java.util.Random;

/**
 * @author foreverActiveBoy
 * @date 2020/7/4 15:44
 * @apiNote 动态数组测试类
 */
public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for(int i = 0 ; i < 10 ; i ++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);


        arr.removeFirst();
        System.out.println(arr);

       for(int i = 0 ; i < 4 ; i ++){
            arr.removeFirst();
            System.out.println(arr);
        }
    }
}
