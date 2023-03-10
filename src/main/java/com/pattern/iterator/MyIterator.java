package com.pattern.iterator;

/**
 * 迭代器接口
 *
 * @author fengh
 * @date 2023-3-7
 */
public interface MyIterator <E>{

    boolean hasNext();
    E getNext();
}
