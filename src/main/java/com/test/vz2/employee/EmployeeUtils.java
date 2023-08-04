package com.test.vz2.employee;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName(Employee employee) {
        Function<Employee, String> fullName = (Employee e) -> e.getFirstName() + " " + e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagerLastName(Employee employee) {
        Function<Employee, String> fullName = (Employee e) -> e.getManager().getLastName();
        return fullName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThatFiveYears(Employee employee) {
        Predicate<Employee> employedLonger = (Employee e) -> (e.getYearsOfServices() > 5);
        return employedLonger.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = (Employee e) -> (e.getNumberOfDirectReport() > 3);
        return moreThanThreeDirectReports.test(employee);
    }

    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = (Employee e) -> (e.getYearsOfServices() > 4 && e.getNumberOfDirectReport() < 2);
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
