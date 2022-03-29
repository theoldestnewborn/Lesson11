package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String doc = "abc-1111-cba-2222-1a2b";

        if (doc.contains("abc") != true) {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("No abc found");;
            }
        }

        if (doc.startsWith("555") != true) {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("Doesnt start with 555");;
            }
        }

        if (doc.endsWith("1a2b") != true) {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("Doesnt end with 1a2b");;
            }
        }
    }
}
