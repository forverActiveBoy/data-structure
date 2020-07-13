package com.yunkan.test;

import com.yunkan.model.ArrayStack;

/**
 * @author foreverActiveBoy
 * @date 2020/7/13 20:38
 * @apiNote
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
