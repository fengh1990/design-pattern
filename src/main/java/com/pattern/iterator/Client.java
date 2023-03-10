package com.pattern.iterator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public class Client {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add("element " + i);
        }
        MyIterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.getNext();
            System.out.println(next);
        }
    }
}
