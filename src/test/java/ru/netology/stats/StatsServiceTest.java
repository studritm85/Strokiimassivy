package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void testCalculateSum() {
        StatsService service = new StatsService();
        int[] data = {1, 2, 3, 4, 5};
        int actual = service.calculateSum(data);
        int expected = 15; // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAverage() {
        StatsService service = new StatsService();
        int[] data = {2, 4, 6, 8, 10};
        double actual = service.calculateAverage(data);
        double expected = 6.0; // (2 + 4 + 6 + 8 + 10) / 5 = 6.0
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax() {
        StatsService service = new StatsService();
        int[] data = {10, 20, 30, 40, 50};
        int actual = service.findMax(data);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMin() {
        StatsService service = new StatsService();
        int[] data = {7, 5, 9, 3, 6};
        int actual = service.findMin(data);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountAboveAverage() {
        StatsService service = new StatsService();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int actual = service.countAboveAverage(data);
        int expected = 4; // Среднее 5, числа выше среднего: 6, 7, 8, 9
        assertEquals(expected, actual);
    }

    @Test
    public void testCountBelowAverage() {
        StatsService service = new StatsService();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int actual = service.countBelowAverage(data);
        int expected = 4; // Среднее 5, числа ниже среднего: 1, 2, 3, 4
        assertEquals(expected, actual);
    }
}
