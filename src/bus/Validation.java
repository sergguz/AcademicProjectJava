package bus;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    public Validation() {
    }

    public static boolean validID(int id) throws MyException {
        if (id < 1000 || id > 9999) {
            throw new MyException("Please enter a 4 digit number");
        }
        else {
            return true;
        }
    }

    public static void validNumber(int number) throws MyException{
        if (number < 0 || number > 10){
            throw new MyException("Please enter a valid option");
        }
    }

    public static void validName(String string) throws MyException {
        if (!Pattern.matches("^[A-Za-z]+$", string)) {
            throw new MyException("Please enter only alphabet letter");
        }
    }

    public static void validPostalCode(String postalCode) throws MyException {
        if (!Pattern.matches("[A-Za-z][0-9][A-Za-z][0-9][A-Za-z][0-9]", postalCode)) {
            throw new MyException("Please enter postal code as following : H7L2L8");
        }
    }

    public static void validSsn(int ssn) throws MyException {
        if (ssn < 100000000 || ssn > 999999999) {
            throw new MyException("Please enter ssn as : 111-1111-1111");
        }
    }

    public static void validEmail(String email) throws MyException {
        if (!Pattern.matches("^\\w+@[a-zA-z]+.[a-zA-Z]{2,3}$", email)) {
            throw new MyException("Please enter a valid email");
        }
    }

    public static void validDay(int day) throws MyException {
        if (day < 1 || day > 32){
            throw new MyException("Please enter a number between 1 and 31");
        }
    }

    public static void validMonth (int month) throws MyException{
        if (month < 1 || month > 12){
            throw new MyException("Please enter a number between 1 and 12");
        }
    }
    public static void validYear (int year) throws MyException {
        if (year < 1899 || year > 3000){
            throw new MyException("Please enter a year between 1900 and 3000");
        }
    }

    public static void negativeNumberException(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Please enter a positive number");
        }
    }

    public static void betweenZeroAndNine(int num) throws MyException {
        if (num < 0 || num > 9) {
            throw new MyException("Please enter a number between 0 and 9");
        }
    }
}
