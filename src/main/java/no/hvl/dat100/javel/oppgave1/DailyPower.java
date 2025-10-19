package no.hvl.dat100.javel.oppgave1;

import static no.hvl.dat100.javel.oppgave1.DayPowerData.*;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        // TODO

        for (double price : prices) {
            System.out.print(price + " NOK ");

        }
        System.out.println();

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        // TODO
        for (double use : usage) {
            System.out.print(use + " kWh ");

        }
        System.out.println();


    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for (double use : usage) {
            sum += use;
        }

        // TODO

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for(int i = 0; i<prices.length; i++){
            price += usage[i] * prices[i];
        }
        // TODO

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        if(price <= THRESHOLD){ // mindre enn 0.9375 ore.
            return 0;
        }
        double overprice = price - THRESHOLD;
        support = overprice * 0.9 * usage; //pengene som blir dekket.


        // TODO

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double totalSupport = 0;

        for (int i = 0; i < usage.length; i++)
        {
            totalSupport += getSupport(usage[i], prices[i]);
        }
            //totalt penger som blir dekket for dagen.
        return totalSupport;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for(double use : usage){
            price += use * NORGESPRIS_KWH;
        }

        // TODO


        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(double use : usage){
            if(use > temp_max){
                temp_max = use;
            }
        }
        // TODO

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        double sum = 0;
        for(double use : usage){
            sum += use;
        }
        // TODO
        average = sum/(usage.length);
        return average;
    }
}