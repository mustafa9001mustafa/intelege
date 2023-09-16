package exam;

import java.util.Date;

public class PerHourEmployee extends Employee{


    private double hours;
    private double hourPrice;
    public PerHourEmployee(long id, String fullName, Date birthDate, String emailAddress, boolean gender) {
        super(id, fullName, birthDate, emailAddress, gender);
    }


    @Override
    public double computeSalary(double hours, double hourPrice) {
        return super.computeSalary(hours, hourPrice);
    }
}
