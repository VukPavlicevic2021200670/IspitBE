package com.example.demo.exceptions.product;

import com.example.demo.exceptions.BaseException;

public class ProductAlreadyExistException extends BaseException{
    public ProductAlreadyExistException(String message) {
        super(message);
    }
}
