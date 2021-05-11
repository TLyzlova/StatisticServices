package ru.netology.stats;

public class StatisticService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long averageSum(long[] purchases) {
        long average = 0;
        long sum = calculateSum(purchases);
        average = sum / 12;
        return average;
    }

    public long maxMonth(long[] purchases) {
        long month = 0;
        long maxMonth = purchases[0];
        long number = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (maxMonth <= purchase) {
                maxMonth = purchase;
                number = month;
            }
        }
        return number;
    }

    public long minMonth(long[] purchases) {
        long month = 0;
        long minMonth = purchases[0];
        long number = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (minMonth >= purchase) {
                minMonth = purchase;
                number = month;
            }
        }
        return number;
    }

    public long underAverage(long[] purchases) {
        long average = 15;
        long underAverage = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                underAverage++;
            }
        }
        return underAverage;
    }

    public long overAverage(long[] purchases) {
        long average = 15;
        long overAverage = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                overAverage++;
            }
        }
        return overAverage;
    }
}

