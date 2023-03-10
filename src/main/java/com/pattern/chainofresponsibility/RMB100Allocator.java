package com.pattern.chainofresponsibility;

import org.springframework.util.ObjectUtils;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public class RMB100Allocator extends AbstractPaperAllocator {
    protected RMB100Allocator() {
        super( RMBType.HUNDRED);
    }
}
