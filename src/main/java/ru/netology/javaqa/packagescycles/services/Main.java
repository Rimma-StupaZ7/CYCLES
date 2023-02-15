package ru.netology.javaqa.packagescycles.services;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.sqr(100, 200);
        System.out.println("Result: " + count);
    }
}

