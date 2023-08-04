import com.test.vz2.employee.Employee;
import com.test.vz2.employee.EmployeeUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void setEmployeeUtils () {
        Employee employee = new Employee();
        employee.setFirstName("Manuel");
        employee.setLastName("Soto-Ruiz");

        String actual = employeeUtils.getFullName(employee);
        assertThat (actual).isEqualTo("Manuel Soto-Ruiz");
    }

    @Test
    void setEmployeeUtils2 () {
        Employee manager = new Employee();
        manager.setFirstName("Diana");
        manager.setLastName("Soto-Ruiz");

        Employee employee = new Employee();
        employee.setFirstName("Manuel");
        employee.setLastName("Soto-Ruiz");
        employee.setManager(manager);


        String actual = employeeUtils.getManagerLastName(employee);
        assertThat (actual).isEqualTo("Soto-Ruiz");
    }
//    hasBeenEmployedLongerThatFiveYears
    @Test
    void setEmployeeUtils3 () {
        Employee employee = new Employee();
        employee.setYearsOfServices(6);


        boolean actual = employeeUtils.hasBeenEmployedLongerThatFiveYears(employee);
        assertThat(actual).isTrue();
    }
//
    @Test
    void setEmployeeUtils4 () {
        Employee employee = new Employee();
        employee.setNumberOfDirectReport(4);


        boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertThat(actual).isTrue();
    }
//    hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports
    @Test
    void setEmployeeUtils5 () {
        Employee employee = new Employee();
        employee.setNumberOfDirectReport(1);
        employee.setYearsOfServices(5);


        boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
        assertThat(actual).isTrue();
    }
    @Test
    void setEmployeeUtils6 () {
        Employee employee = new Employee();
        employee.setNumberOfDirectReport(1);


        boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertThat(actual).isFalse();
    }
    //    hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports
    @Test
    void setEmployeeUtils7 () {
        Employee employee = new Employee();
        employee.setNumberOfDirectReport(5);
        employee.setYearsOfServices(5);


        boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
        assertThat(actual).isFalse();
    }
}
