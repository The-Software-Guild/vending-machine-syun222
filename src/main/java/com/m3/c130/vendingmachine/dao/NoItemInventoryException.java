package com.m3.c130.vendingmachine.dao;

public class NoItemInventoryException extends Exception {
    public NoItemInventoryException (String msg) {
        super(msg);
    }

    public NoItemInventoryException (String msg, Throwable cause) {
        super(msg, cause);
    }
}
