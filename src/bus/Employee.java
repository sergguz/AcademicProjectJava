package bus;

import java.io.Serializable;

public abstract class Employee implements IPayable, Comparable<Employee>, Serializable {
    private static final long serialVersionUID = -2564061237433545448L;
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private Telephone telephone;
    private Date hiredDate;
    private Integer socialSecurityNumber;
    private EmpType type;

    public Employee(String firstName, String lastName, String email, Address address, Telephone telephone, Date hiredDate, int socialSecurityNumber, EmpType type) {
        this.setId(Sequence.getIndex());
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
        this.hiredDate = hiredDate;
        this.socialSecurityNumber = socialSecurityNumber;
        this.type = type;
    }

    public Employee() {
        super();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws MyException{
        Validation.validName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws MyException{
        Validation.validName(firstName);
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws MyException{
        Validation.validEmail(email);
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Integer socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public EmpType getType() {
        return type;
    }

    public void setType(EmpType type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", telephone=" + telephone +
                ", hiredDate=" + hiredDate +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", type=" + type +
                '}';
    }

    public int compareTo(Employee e1){
        if (this.getId().compareTo(e1.getId())<0){
            return -1;
        }
        else if (this.getId() .compareTo(e1.getId())>0){
            return +1;
        }
        return 0;
    }

    public int compareTo2(Employee e1){
        if (this.getSocialSecurityNumber().compareTo(e1.getSocialSecurityNumber())<0){
            return -1;
        }
        else if (this.getSocialSecurityNumber().compareTo(e1.getSocialSecurityNumber())>0){
            return +1;
        }
        return 0;
    }
}
