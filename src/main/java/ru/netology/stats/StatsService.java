package ru.netology.stats;

public class StatsService {

    // Метод для вычисления суммы всех элементов массива
    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    // Метод для вычисления среднего значения элементов массива
    public double calculateAverage(int[] data) {
        int sum = calculateSum(data);
        return (double) sum / data.length;
    }

    // Метод для поиска максимального значения в массиве
    public int findMax(int[] data) {
        int max = data[0];
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Метод для поиска минимального значения в массиве
    public int findMin(int[] data) {
        int min = data[0];
        for (int value : data) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Метод для вычисления количества значений выше среднего
    public int countAboveAverage(int[] data) {
        double average = calculateAverage(data);
        int count = 0;
        for (int value : data) {
            if (value > average) {
                count++;
            }
        }
        return count;
    }

    // Метод для вычисления количества значений ниже среднего
    public int countBelowAverage(int[] data) {
        double average = calculateAverage(data);
        int count = 0;
        for (int value : data) {
            if (value < average) {
                count++;
            }
        }
        return count;
    }
}
