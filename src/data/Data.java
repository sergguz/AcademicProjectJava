package data;

import bus.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    private static List<Employee> empList = new ArrayList<>();
    private static List<FullTime> listFullTime = new ArrayList<>();
    private static List<PartTimeConsultant> listPartConsultant = new ArrayList<>();
    private static List<PartTimeTrainee> listPartTrainee = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static List<Employee> getEmpList() {
        return empList;
    }

    public static void setEmpList(List<Employee> empList) {
        Data.empList = empList;
    }

    public static List<FullTime> getListFullTime() {
        return listFullTime;
    }

    public static void setListFullTime(List<FullTime> listFullTime) {
        Data.listFullTime = listFullTime;
    }

    public static List<PartTimeConsultant> getListPartConsultant() {
        return listPartConsultant;
    }

    public static void setListPartConsultant(List<PartTimeConsultant> listPartConsultant) {
        Data.listPartConsultant = listPartConsultant;
    }

    public static List<PartTimeTrainee> getListPartTrainee() {
        return listPartTrainee;
    }

    public static void setListPartTrainee(List<PartTimeTrainee> listPartTrainee) {
        Data.listPartTrainee = listPartTrainee;
    }

    //Main Menu
    public static int MainMenu() throws MyException{
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add a new employee");
        System.out.println("2. Search an employee");
        System.out.println("3. Modify trainee to full time");
        System.out.println("4. Remove employee");
        System.out.println("5. Sort employees by id");
        System.out.println("6. Sort employees by social security number");
        System.out.println("7. Display employees");
        System.out.println("8. Write to File");
        System.out.println("9. Read from File");
        System.out.println("10. Exit application");
        System.out.println("Please enter the option you want to execute: ");
        option = scan.nextInt();
        Validation.validNumber(option);
        return option;
    }

    //SubMenu
    public static int TypeOfEmployee(){
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Trainee");
        System.out.println("2. Consultant");
        System.out.println("3. Full Time");
        System.out.println("Please select one of the previous options: ");
        option = scan.nextInt();
        return option;
    }

    //add new trainee
    public static List<PartTimeTrainee> addTrainee () throws MyException{
        PartTimeTrainee trainee = new PartTimeTrainee();
        Address address1 = new Address();
        Telephone tel1 = new Telephone();
        Date hire = new Date();
        boolean valid = false;

        trainee.setId(Sequence.getIndex());
        System.out.println("First name: ");
        do {
            try {
                trainee.setFirstName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Last name: ");
        do {
            try {
                trainee.setLastName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (valid == false);
        valid = false;
        System.out.println("Email: ");
        do {
            try {
                trainee.setEmail(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address street name: ");
        do {
            try {
                address1.setStreetName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address number: ");
        address1.setNumber(scan.nextInt());
        scan.nextLine();
        System.out.println("Address postal code: ");
        do {
            try {
                address1.setPostalCode(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        trainee.setAddress(address1);
        System.out.println("Telephone country code: ");
        tel1.setCountryCode(scan.nextInt());
        System.out.println("Telephone area code: ");
        tel1.setAreaCode(scan.nextInt());
        System.out.println("Telephone number: ");
        tel1.setNumber(scan.nextInt());
        trainee.setTelephone(tel1);
        System.out.println("Hired date day: ");
        do {
            try {
                hire.setDay(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date month: ");
        do {
            try {
                hire.setMonth(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date year: ");
        do {
            try {
                hire.setYear(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        trainee.setHiredDate(hire);
        System.out.println("Social security number: ");
        trainee.setSocialSecurityNumber(scan.nextInt());
        trainee.setType(EmpType.PartTimeTrainee);

        System.out.println("Contract payment: ");
        trainee.setContractPayment(scan.nextDouble());
        scan.nextLine();
        empList.add(trainee);
        listPartTrainee.add(trainee);
        return listPartTrainee;
    }

    //add new Full Time
    public static List<FullTime> addFullTime () throws MyException{
        FullTime fullTime = new FullTime();
        Address address1 = new Address();
        Telephone tel1 = new Telephone();
        Date hire = new Date();
        boolean valid = false;

        fullTime.setId(Sequence.getIndex());
        System.out.println("First name: ");
        do {
            try {
                fullTime.setFirstName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Last name: ");
        do {
            try {
                fullTime.setLastName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Email: ");
        do {
            try {
                fullTime.setEmail(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address street name: ");
        do {
            try {
                address1.setStreetName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address number: ");
        address1.setNumber(scan.nextInt());
        scan.nextLine();
        System.out.println("Address postal code: ");
        do {
            try {
                address1.setPostalCode(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        fullTime.setAddress(address1);
        System.out.println("Telephone country code: ");
        tel1.setCountryCode(scan.nextInt());
        System.out.println("Telephone area code: ");
        tel1.setAreaCode(scan.nextInt());
        System.out.println("Telephone number: ");
        tel1.setNumber(scan.nextInt());
        fullTime.setTelephone(tel1);
        System.out.println("Hired date day: ");
        do {
            try {
                hire.setDay(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date month: ");
        do {
            try {
                hire.setMonth(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date year: ");
        do {
            try {
                hire.setYear(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        fullTime.setHiredDate(hire);
        System.out.println("Social security number: ");
        fullTime.setSocialSecurityNumber(scan.nextInt());
        fullTime.setType(EmpType.Fulltime);
        System.out.println("Annual Payment: ");
        fullTime.setAnnualPayment(scan.nextDouble());
        scan.nextLine();
        getListFullTime().add(fullTime);
        empList.add(fullTime);
        return getListFullTime();
    }

    //add new PartTime consultant
    public static List<PartTimeConsultant> addConsultant () throws MyException{
        PartTimeConsultant consultant = new PartTimeConsultant();
        Address address1 = new Address();
        Telephone tel1 = new Telephone();
        Date hire = new Date();
        boolean valid = false;

        consultant.setId(Sequence.getIndex());
        System.out.println("First name: ");
        do {
            try {
                consultant.setFirstName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Last name: ");
        do {
            try {
                consultant.setLastName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Email: ");
        do {
            try {
                consultant.setEmail(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address street name: ");
        do {
            try {
                address1.setStreetName(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Address number: ");
        address1.setNumber(scan.nextInt());
        scan.nextLine();
        System.out.println("Address postal code: ");
        do {
            try {
                address1.setPostalCode(scan.nextLine());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        consultant.setAddress(address1);
        System.out.println("Telephone country code: ");
        tel1.setCountryCode(scan.nextInt());
        System.out.println("Telephone area code: ");
        tel1.setAreaCode(scan.nextInt());
        System.out.println("Telephone number: ");
        tel1.setNumber(scan.nextInt());
        consultant.setTelephone(tel1);
        System.out.println("Hired date day: ");
        do {
            try {
                hire.setDay(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date month: ");
        do {
            try {
                hire.setMonth(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        System.out.println("Hired date year: ");
        do {
            try {
                hire.setYear(scan.nextInt());
                valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!valid);
        valid = false;
        consultant.setHiredDate(hire);
        System.out.println("Social security number: ");
        consultant.setSocialSecurityNumber(scan.nextInt());
        consultant.setType(EmpType.PartTimeConsultant);

        System.out.println("Hourly Rate: ");
        consultant.setHourlyRate(scan.nextDouble());
        System.out.println("Number of hours for the two weeks: ");
        consultant.setHoursWorked(scan.nextDouble());
        scan.nextLine();
        listPartConsultant.add(consultant);
        empList.add(consultant);
        return listPartConsultant;
    }

    //sorting employees
    public static void ListClassification (List<Employee> listEmp){
        for (Employee employee: listEmp){
            if (employee instanceof FullTime){
                getListFullTime().add((FullTime) employee);
            }
            else if (employee instanceof PartTimeConsultant){
                listPartConsultant.add((PartTimeConsultant) employee);
            }
            else{
                listPartTrainee.add((PartTimeTrainee) employee);
            }
        }
    }
    //search Employee
    public static void searchEmpById(int id){
        Employee empFound = null;
        for (Employee employee: empList){
            if (employee.getId() == id){
                empFound = employee;
                break;
            }
        }
        if (empFound != null){
            System.out.println(empFound);
        }
        else{
            System.out.println("Employee not found or does not exist");
        }
    }
    //Remove Employee
    public static void removeEmpById(int id){
        Employee empFound = null;
        for (Employee employee: empList){
            if (employee.getId() == id){
                empFound = employee;
                break;
            }
        }
        if (empFound != null){
            empList.remove(empFound);
        }
        else{
            System.out.println("Employee was not removed because it does not exist");
        }
    }
    //Modify trainee
    public static void modifyTrainee (int id, double annualPayment) throws MyException{
        PartTimeTrainee traineeFound = null;
        FullTime fullTimeEmp = new FullTime();
        for (PartTimeTrainee trainee: listPartTrainee){
            if (trainee.getId() == id){
                traineeFound = trainee;
            }
        }
        if (traineeFound != null){
            fullTimeEmp.setId(traineeFound.getId());
            fullTimeEmp.setFirstName(traineeFound.getFirstName());
            fullTimeEmp.setLastName(traineeFound.getLastName());
            fullTimeEmp.setEmail(traineeFound.getEmail());
            fullTimeEmp.setAddress(traineeFound.getAddress());
            fullTimeEmp.setTelephone(traineeFound.getTelephone());
            fullTimeEmp.setHiredDate(traineeFound.getHiredDate());
            fullTimeEmp.setSocialSecurityNumber(traineeFound.getSocialSecurityNumber());
            fullTimeEmp.setType(EmpType.Fulltime);
            fullTimeEmp.setAnnualPayment(annualPayment);
            listPartTrainee.remove(traineeFound);
            getListFullTime().add(fullTimeEmp);
        }
    }
}
