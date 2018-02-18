package prod;

import bus.*;
import data.Data;
import data.FileHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException, ClassNotFoundException {
        IdComparator idComparator = new IdComparator();
        SocialComparator socialComparator = new SocialComparator();
        Scanner scan = new Scanner(System.in);
        int mainOption;

        do {
            int option = Data.MainMenu();
            switch (option) {
                case 1:
                    int option2 = Data.TypeOfEmployee();
                    switch (option2){
                        case 1:
                            Data.addTrainee();
                            break;
                        case 2:
                            Data.addConsultant();
                            break;
                        case 3:
                            Data.addFullTime();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Please enter the ID you want to look for: ");
                    int idSearch = scan.nextInt();
                    scan.nextLine();
                    Data.searchEmpById(idSearch);
                    break;
                case 3:
                    System.out.println("Please enter the ID of the trainee you want to upgrade: ");
                    int idUpgrade = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Please enter the salary you want to assign to the new full time employee: ");
                    double sal = scan.nextDouble();
                    Data.modifyTrainee(idUpgrade, sal);
                    break;
                case 4:
                    System.out.println("Please enter the ID of the employee you want to remove: ");
                    int idRemove = scan.nextInt();
                    Data.removeEmpById(idRemove);
                    break;
                case 5:
                    Collections.sort(Data.getEmpList(), idComparator);
                    for (Employee employee: Data.getEmpList()){
                        System.out.println(employee);
                    }
                    break;
                case 6:
                    Collections.sort(Data.getEmpList(), socialComparator);
                    for (Employee employee: Data.getEmpList()){
                        System.out.println(employee);
                    }
                    break;
                case 7:
                    for (PartTimeConsultant consultant: Data.getListPartConsultant()){
                        System.out.println(consultant);
                    }
                    for (PartTimeTrainee trainee: Data.getListPartTrainee()){
                        System.out.println(trainee);
                    }
                    for (FullTime fullTime: Data.getListFullTime()){
                        System.out.println(fullTime);
                    }
                    break;
                case 8:
                    System.out.println("We are writing to file");
                    FileHandler.writeData((ArrayList) Data.getEmpList());
                    System.out.println("File written successfully");
                    break;
                case 9:
                    System.out.println("We are reading from file");
                    FileHandler.readData();
                    System.out.println("File read successfully");
            }
            System.out.println("Do you want to continue with other operation? 1. Yes  2. No");
            mainOption = scan.nextInt();
        } while (mainOption == 1);


    }
}
