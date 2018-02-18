package bus;

import java.io.Serializable;

public class PartTimeTrainee extends Employee implements Serializable{
    private static final long serialVersionUID = -4833929169692518085L;
    double contractPayment;
    double payment;

    public PartTimeTrainee(String firstName, String lastName, String email, Address address, Telephone telephone, Date hiredDate, int socialSecurityNumber, EmpType type, double contractPayment) {
        super(firstName, lastName, email, address, telephone, hiredDate, socialSecurityNumber, type);
        this.contractPayment = contractPayment;
        this.payment = payment();
    }

    public PartTimeTrainee() {
        super();
    }

    public double getContractPayment() {
        return contractPayment;
    }

    public void setContractPayment(double contractPayment) {
        this.contractPayment = contractPayment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double payment(){
        return contractPayment / 8;
    }

    @Override
    public String toString() {
        return "PartTimeTrainee{" + super.toString() +
                "contractPayment=" + contractPayment +
                ", payment=" + payment +
                '}';
    }
}
