package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("a) power prices per hour");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("b) power usage per hour");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("c) power usage for one day");
        double usage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println(usage + "kWh");
        System.out.println("d) total spot price for one day");
        double spotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println(spotPrice + " NOK");
        System.out.println("e & f) money saved with power support for one day");
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day) + " NOK");
        System.out.println();
        System.out.println("g) Norgespris for one day");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day) + " NOK");
        System.out.println("h) Max power consumption for one day");
        System.out.println(DailyPower.findPeakUsage(powerusage_day) + " kWh");
        System.out.println("i) Average power consumption for one day");
        System.out.println(DailyPower.findAvgPower(powerusage_day) + " kWh");

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
