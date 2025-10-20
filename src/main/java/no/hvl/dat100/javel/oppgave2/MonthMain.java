package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("a)");

        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("b)");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("c)");
        double monthly_usage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println(monthly_usage + " kWh");
        System.out.println("d)");
        System.out.println("Threshold 1000: " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("Threshold 5000: " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("e)");
        System.out.println(MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month) + " NOK");
        System.out.println("f)");
        System.out.println(MonthlyPower.computePowerSupport(power_usage_month, power_prices_month) + "NOK");
        System.out.println("g)");
        System.out.println(MonthlyPower.computeNorgesPrice(power_usage_month) + " NOK");

        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}