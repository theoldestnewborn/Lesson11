package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.next();
        if (doc.contains("abc") != true) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("no abc found");
            }
        }

        if (doc.startsWith("555") != true) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Doesnt start with 555");;
            }
        }
    }
}
