package com.automation;

import java.io.*;

class Operation {
    // Overloaded method: add with two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: add with three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: add with two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

class AdvancedOperation extends Operation {
    // Overriding the add method with different behavior
    @Override
    public int add(int a, int b) {
        return a * b;
    }
}

public class POlyMorphism {
    public static void main(String[] args) {
        Operation op = new Operation();
        Operation advOp = new AdvancedOperation();

        System.out.println("Operation add (2, 3): " + op.add(2, 3));
        System.out.println("AdvancedOperation add (2, 3): " + advOp.add(2, 3));  // Multiplication due to overriding

        try {
            // ArithmeticException: Divide by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException: Illegal array index
            int[] arr = new int[5];
            int index = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // ClassNotFoundException: Trying to load a non-existent class
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }

        try {
            // FileNotFoundException: Trying to open a non-existent file
            FileInputStream file = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }

        try {
            // IOException: General I/O exception
            throw new IOException("Manual IOException");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        try {
            // InterruptedException: Simulate interruption
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }

        try {
            // NoSuchFieldException: Accessing a non-existent field
            Class<?> cls = String.class;
            cls.getField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Caught NoSuchFieldException: " + e.getMessage());
        }

        try {
            // NoSuchMethodException: Accessing a non-existent method
            Class<?> cls = String.class;
            cls.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }

        try {
            // NullPointerException: Dereferencing a null reference
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            // NumberFormatException: Parsing an invalid number
            int num = Integer.parseInt("invalid");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        try {
            // StringIndexOutOfBoundsException: Accessing invalid index in a string
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // IllegalStateException: Simulating an illegal state
            Thread t = new Thread();
            t.start();
            t.start();  // Attempting to start a thread twice
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e.getMessage());
        }

        try {
            // IllegalArgumentException: Passing an invalid argument
            int[] arr = new int[-5];  // Negative array size
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}

