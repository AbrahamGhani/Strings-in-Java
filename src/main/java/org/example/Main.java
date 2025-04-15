package org.example;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String nameSuffix = scanner.nextLine();

        String fullName = firstName + " " + middleName + " " + lastName;

        if (!nameSuffix.isBlank()){
            fullName += ", " + nameSuffix;
        }

        System.out.println(fullName);















    }
}