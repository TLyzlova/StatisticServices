package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void averageSum() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSum(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void maxMonth() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void underAverage() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void overAverage() {
        StatisticService service = new StatisticService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.overAverage(purchases);

        assertEquals(expected, actual);
    }
}