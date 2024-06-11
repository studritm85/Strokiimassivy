package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void testCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        double actual = service.calculateAverage(sales);
        assertEquals(expected, actual, 0.0001); // Допустимое отклонение для double
    }

    @Test
    public void testFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Месяц с продажами 20 - это 6-й и 8-й месяцы (нумерация с 1)
        int actual = service.findMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Месяц с продажами 7 - это 9-й месяц (нумерация с 1)
        int actual = service.findMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Месяцы с продажами ниже среднего (7, 8, 13, 14, 14)
        int actual = service.countMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Месяцы с продажами выше среднего (17, 18, 19, 20, 20)
        int actual = service.countMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}
