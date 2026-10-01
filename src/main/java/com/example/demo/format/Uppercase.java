package com.example.demo.format;

import org.springframework.stereotype.Component;

@Component("uppercase")
public class Uppercase implements MessageFormatter {
    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}
