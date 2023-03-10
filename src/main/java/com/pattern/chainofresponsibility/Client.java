package com.pattern.chainofresponsibility;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public class Client {


    private static AbstractPaperAllocator allocator = new RMB100Allocator();

    static {
        RMB50Allocator fifty = new RMB50Allocator();
        allocator.setNext(fifty);
        fifty.setNext(new RMB10Allocator());
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入人民币金额");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            CurrencyRequest currencyRequest = new CurrencyRequest(amount);
            allocator.handle(currencyRequest);
            currencyRequest.cashOut();
        }
    }
}
