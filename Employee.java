package exam;

import java.util.Date;

public class Employee {
    private final long id;
    private final String fullName;
    private final Date birthDate;
    private final String emailAddress;
    private final boolean gender;

    public Employee(long id, String fullName, Date birthDate, String emailAddress, boolean gender) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }


    public String Info() {
//        System.out.println("اسم الموظف" + fullName);

        return "اسم الموظف" + fullName + "\n" +
                "رقم  الهوية" + id + "\n" + "العمر" + birthDate + "\n" ;
//                "الجنس " + gender + "\n" + "الراتب الأساسي" + computeSalary() + "\n";
    }


    public double computeSalary(double hours , double hourPrice){
        return hours * hourPrice;
    }


    public double computeSalary(double baseSalary){
        return baseSalary;
    }
}
