package bus;

import java.io.Serializable;

public class FullTime extends Employee implements Serializable {
    private static final long serialVersionUID = 689414983229653854L;
    double annualPayment;
    double payment;

    public FullTime(String firstName, String lastName, String email, Address address, Telephone telephone, Date hiredDate, int socialSecurityNumber, EmpType type, double annualPayment) {
        super(firstName, lastName, email, address, telephone, hiredDate, socialSecurityNumber, type);
        this.annualPayment = annualPayment;
        this.payment = payment();
    }

    public FullTime() {
        super();
    }

    public double getAnnualPayment() {
        return annualPayment;
    }

    public void setAnnualPayment(double annualPayment) {
        this.annualPayment = annualPayment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double payment(){
        return annualPayment / 26;
    }

    @Override
    public String toString() {
        return "FullTime{" + super.toString() +
                "annualPayment=" + annualPayment +
                ", payment=" + payment +
                '}';
    }
}
