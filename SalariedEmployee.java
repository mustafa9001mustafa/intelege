package exam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class SalariedEmployee extends Employee{

    private double baseSalary;
    private double AttendancePercentage;
    private final ArrayList<String> department = new ArrayList<>(Arrays.asList("االدارة","العاملين","الخدمات"));




    public SalariedEmployee(long id, String fullName, Date birthDate, String emailAddress, boolean gender) {
        super(id, fullName, birthDate, emailAddress, gender);
    }

    @Override
    public double computeSalary(double baseSalary) {
        return super.computeSalary(baseSalary);
    }

    public void addBonus(){
        for (String s : department) {
            if (s.equals("االدارة") ) {
                baseSalary = baseSalary * 0.02;
            } else if ( s.equals("العاملين")) {
                baseSalary = baseSalary * 0.05;

            } else if (s.equals("الخدمات")) {
                baseSalary = baseSalary * 0.10;

            }
        }
    }

    public void deduct(){
        AttendancePercentage = AttendancePercentage -1;
    }

}
