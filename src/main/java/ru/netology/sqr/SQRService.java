package ru.netology.sqr;

public class SQRService {
    public int sqrCounter(int rangeFrom, int rangeUpTo) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            var sqr = i * i;
            if (sqr >= rangeFrom && sqr <= rangeUpTo) {
                count++;
            }
        }
        return count;
    }
}
