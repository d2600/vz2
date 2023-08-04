package com.test.vz2.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearsOfServices;
    private Employee manager;
    private int numberOfDirectReport;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfServices() {
        return yearsOfServices;
    }

    public void setYearsOfServices(int yearsOfServices) {
        this.yearsOfServices = yearsOfServices;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public int getNumberOfDirectReport() {
        return numberOfDirectReport;
    }

    public void setNumberOfDirectReport(int numberOfDirectReport) {
        this.numberOfDirectReport = numberOfDirectReport;
    }


}
