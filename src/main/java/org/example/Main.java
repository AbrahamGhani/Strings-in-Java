package org.example;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {


///////////////////////////////////---- Exercise 1 ----///////////////////////////////////

//        System.out.print("First Name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.print("Middle Name: ");
//        String middleName = scanner.nextLine();
//
//        System.out.print("Last Name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.print("Suffix: ");
//        String nameSuffix = scanner.nextLine();
//
//        String fullName = firstName + " " + middleName + " " + lastName;
//
//        if (!nameSuffix.isBlank()){
//            fullName += ", " + nameSuffix;
//        }
//
//        System.out.println(fullName);


///////////////////////////////////---- Exercise 2 ----///////////////////////////////////


        System.out.print("Full Name:\t");
        String userFullName = scanner.nextLine();



        int firstSpaceInName = userFullName.indexOf(" ");
        int secondSpaceInName = userFullName.indexOf(" ", firstSpaceInName + 1);
        int commaInName = userFullName.indexOf(",");


        String userFirstName = userFullName.substring(0, firstSpaceInName);
        String userSuffix = "";
        String userMiddleName = "";
        String userLastName = "";


        if (commaInName != -1) {
            // Only extract last name up to comma if space comes before comma
            if (secondSpaceInName != -1 && secondSpaceInName < commaInName) {
                userLastName = userFullName.substring(secondSpaceInName + 1, commaInName).trim();
            } else {
                userLastName = userFullName.substring(firstSpaceInName + 1, commaInName).trim();
            }

            userSuffix = userFullName.substring(commaInName + 1).trim();
        } else {
            userLastName = userFullName.substring(secondSpaceInName + 1).trim();
            userSuffix = "(none)";
        }




        if(secondSpaceInName != -1 && userFullName.charAt(secondSpaceInName -1) != ','){
            userMiddleName = userFullName.substring(firstSpaceInName + 1, secondSpaceInName);
        }
        else {
            userMiddleName = "(none)";
        }


        System.out.println("First Name: " + userFirstName);
        System.out.println("Middle Name: " + userMiddleName);
        System.out.println("Last Name: " + userLastName);
        System.out.println("Suffix: " + userSuffix);

    }
}