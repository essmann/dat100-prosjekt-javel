package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        int count = 1;
        for (double[] day : usage) {
            System.out.print("Day " + count + ": ");
            DailyPower.printPowerUsage(day);
            count++;
            System.out.println();

        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        int count = 1;
        for (double[] day_prices : prices) {
            System.out.print("Day " + count + ": ");
            DailyPower.printPowerPrices(day_prices);
            count++;
            System.out.println();

        }
        // TODO

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for (double[] day : usage) {
            sum += DailyPower.computePowerUsage(day);
        }
        // TODO

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        double temp_sum = 0;
        for (double[] day : powerusage) {
            temp_sum = 0;
            for (double hour : day) {
                temp_sum += hour;
            }
            if (temp_sum > threshold) {
                return true;
            }
        }

        // TODO

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price += DailyPower.computeSpotPrice(usage[i], prices[i]);
        }
        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        for (int i = 0; i < usage.length; i++) {
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] day : usage) {
            price += DailyPower.computeNorgesPrice(day);
        }
        // TODO

        return price;
    }
}
