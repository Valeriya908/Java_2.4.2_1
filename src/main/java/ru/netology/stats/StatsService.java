package ru.netology.stats;

public class StatsService {

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findUnderAverage(long[] sales) {
        int counterMin = 0;
        for (long sale : sales) {
            if (sale < findAverage(sales)) {
                counterMin++;
            }
        }
        return counterMin;
    }

    public int findOverAverage(long[] sales) {
        int counterMax = 0;
        for (long sale : sales) {
            if (sale > findAverage(sales)) {
                counterMax++;
            }
        }
        return counterMax;
    }
}
