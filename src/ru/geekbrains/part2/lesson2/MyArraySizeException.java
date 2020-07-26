package ru.geekbrains.part2.lesson2;

import java.io.PrintStream;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
        System.out.println("You should enter correct size of array.");
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
