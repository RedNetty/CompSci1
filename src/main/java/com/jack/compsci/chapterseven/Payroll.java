package com.jack.compsci.chapterseven;

public class Payroll {
    int[] employeeID = {5658845, 4520125, 7895122, 8777541,
            8451277, 1302850,7580489};
    int[] hoursWorked = {20, 30, 45, 65, 25, 32, 64};
    int[] payRate = {20, 20, 20, 30, 24, 18, 23};

    public int getEmployeeID(int arrayIndex) {
        return employeeID[arrayIndex];
    }
    private int findEmployeeIndex(int id) { //Used to find array index of a specified employeeID
        for (int i = 0; i < employeeID.length; i++) {
            if (employeeID[i] == id) {
                return i;
            }
        }
        return 0;
    }
    /*
    Extensive accessors and mutators.
     */
    public int[] getEmployeeID() {
        return employeeID;
    }

    public int[] getHoursWorked() {
        return hoursWorked;
    }

    public int[] getPayRate() {
        return payRate;
    }


    public void setEmployeeID(int[] employeeID) {
        this.employeeID = employeeID;

    }

    public void updatePayRate(int id, int updatedRate) {
        payRate[findEmployeeIndex(id)] = updatedRate;
    }

    public void updateHoursWorked(int id, int updatedHours) {
        hoursWorked[findEmployeeIndex(id)] = updatedHours;
    }

    public int getEmployeeHours(int id) {
        return hoursWorked[findEmployeeIndex(id)];
    }

    public void setHoursWorked(int[] hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeRate(int id) {
        return payRate[findEmployeeIndex(id)];
    }

    public void setPayRate(int[] payRate) {
        this.payRate = payRate;
    }
}
