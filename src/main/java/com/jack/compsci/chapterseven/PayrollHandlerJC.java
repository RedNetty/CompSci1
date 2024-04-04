package com.jack.compsci.chapterseven;

public class PayrollHandlerJC {

    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        outputPayRoll(payroll);


        payroll.updatePayRate( 7895122, 42);
        payroll.updateHoursWorked( 7895122, 82);
        outputPayRoll(payroll);


    }

    public static void outputPayRoll(Payroll payroll) {
        for(int i = 0; i < payroll.getEmployeeID().length; i++) {
            int currentID = payroll.getEmployeeID(i);
            int grossPay = payroll.getEmployeeHours(currentID) * payroll.getEmployeeRate(currentID);
            System.out.println("\n-------------------------------------------"); //Just used for aesthetically separating outputs
            System.out.println("\nEmployee ID: " + currentID + "\nHourly Rate: $" + payroll.getEmployeeRate(currentID) + "/h"
                    + "\nHours Worked: " + payroll.getEmployeeHours(currentID) + "h" + "\nGross Pay: " + grossPay);
        }
    }
}
