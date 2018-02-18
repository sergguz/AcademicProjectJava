package bus;

import java.io.Serializable;

public class PartTimeConsultant extends Employee implements Serializable{
    private static final long serialVersionUID = -4593835195482858498L;
    private double hoursWorked;
    private double hourlyRate;
    double payment;

    public PartTimeConsultant() {
        super();
    }

    public PartTimeConsultant(String firstName, String lastName, String email, Address address, Telephone telephone, Date hiredDate, int socialSecurityNumber, EmpType type, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, email, address, telephone, hiredDate, socialSecurityNumber, type);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.payment = payment();
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double payment(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeConsultant{" + super.toString() +
                "hoursWorked=" + hoursWorked +
                ", payment=" + payment +
                '}';
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
