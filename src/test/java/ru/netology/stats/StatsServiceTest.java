package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        long expected = 179;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        double expected = 14.916666666666666;
        double actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        int expected = 12;
        int actual = service.findMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        int expected = 9;
        int actual = service.findMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        int expected = 5;
        int actual = service.countMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 10, 21};
        int expected = 7; // Исправленное ожидаемое значение
        int actual = service.countMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }


}
