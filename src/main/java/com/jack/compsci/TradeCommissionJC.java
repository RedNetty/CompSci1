package com.jack.compsci;

import java.text.NumberFormat;
import java.util.Locale;

public class TradeCommissionJC {



    public static void main(String[] arg) {
        int totalStocks = 500;
        float commissionPercentage = .05f;
        double pricePerStock = 33.89;
        double totalPaid = pricePerStock*totalStocks;

        System.out.println("Total Paid (w/o commission): " + formatPayment(totalPaid));
        System.out.println("Commission total: " + formatPayment(totalPaid * commissionPercentage));
        System.out.print("Total Paid (commission included): "+ formatPayment(totalPaid + (totalPaid*commissionPercentage)));


    }

    private static  String formatPayment(double total) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(total);
    }
}
