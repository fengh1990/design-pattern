package com.pattern.chainofresponsibility;

import org.springframework.util.ObjectUtils;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public abstract class AbstractPaperAllocator {

    private AbstractPaperAllocator next;
    private final RMBType type;

    protected AbstractPaperAllocator(RMBType type) {
        this.type = type;
    }

    protected  void handle(CurrencyRequest request) {
        if (request.getTotalAmount() >= getType().getAmount()) {
            int num = request.getTotalAmount() / getType().getAmount();
            int leftAmount = request.getTotalAmount() % getType().getAmount();
            request.addAllocator(getType(), num, leftAmount);
        }
        if (request.getTotalAmount() > 0 && !ObjectUtils.isEmpty(getNext())) {
            getNext().handle(request);
        }
    }

    public void setNext(AbstractPaperAllocator next) {
        this.next = next;
    }

    protected RMBType getType() {
        return type;
    }

    protected AbstractPaperAllocator getNext() {
        return next;
    }


}
