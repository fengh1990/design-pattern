package com.pattern.chainofresponsibility;

import java.text.MessageFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public class CurrencyRequest {

    private int totalAmount;

    private final ConcurrentMap<RMBType, Integer> allocatorMap = new ConcurrentHashMap<>();

    public CurrencyRequest(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void addAllocator(RMBType assignMoneyType, int assignMoneyNum, int leftAmount) {
        this.totalAmount = leftAmount;
        allocatorMap.put(assignMoneyType, assignMoneyNum);
    }

    /**
     * 出钞
     */
    public void cashOut() {
        if (totalAmount > 0) {
            System.out.println(MessageFormat.format("    系统无法提供本次服务，有【{0}】元无法分配纸币",
                    totalAmount));
        } else {
            // 出钞
            allocatorMap.forEach((key, value) ->
                    System.out.println(MessageFormat.format("    面额【{0}】：【{1}】张", key.getName(), value))
            );
        }
    }

}
