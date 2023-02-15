package ru.netology.javaqa.packagescycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SRQServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqr(200, 300 );

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcNotExact(){
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.sqr(150, 350 );

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcNewExact(){
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqr(-150, -330 );

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcOne(){
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.sqr(100, 120 );

        Assertions.assertEquals(expected, actual);
    }
}
