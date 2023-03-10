package com.pattern.iterator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public interface MyList <E>{

    boolean add(E ele);
    E get(int index);
    int size();
    MyIterator<E> iterator();
}
