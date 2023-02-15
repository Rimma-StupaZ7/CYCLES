package ru.netology.javaqa.packagescycles.services;

public class SQRService {
    public int sqr(int x, int y) {
        int max = 99;
        int min = 10;
        int count = 0;
        for (int i = min; i <= max; i++) {
            int b = i * i;
            if (b >= x && b <= y) {
                count = count + 1;
                System.out.println("Квадрат числа: " + i + " равен :" + b);
            }
        }
        return count;
    }
}