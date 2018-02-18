package bus;

import java.io.Serializable;

public class Address implements Serializable{
    private static final long serialVersionUID = -3613248884775485310L;
    private String streetName;
    private int number;
    private String postalCode;

    public Address(String streetName, int number, String postalCode) {
        this.streetName = streetName;
        this.number = number;
        this.postalCode = postalCode;
    }

    public Address() {
        super();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) throws MyException {
        Validation.validName(streetName);
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) throws MyException{
        Validation.validPostalCode(postalCode);
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", number=" + number +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
