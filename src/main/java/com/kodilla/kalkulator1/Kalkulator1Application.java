package com.kodilla.kalkulator1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kalkulator1Application {

    public static void main(String[] args) {
        int a = 5;
        int b = 2005;
        int sum;
        int x;
        sum = a + b;
        x = b - a;
        System.out.println(sum + " " + x);
    }
}
