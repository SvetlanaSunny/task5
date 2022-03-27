package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int rangeFrom = 200; // диапазон от
        int rangeUpTo = 300; // диапазон до
        SQRService service = new SQRService();
        System.out.println(service.sqrCounter(rangeFrom, rangeUpTo));
    }
}
