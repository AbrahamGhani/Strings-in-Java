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


//        System.out.print("Full Name:\t");
//        String userFullName = scanner.nextLine();
//
//
//
//        int firstSpaceInName = userFullName.indexOf(" ");
//        int secondSpaceInName = userFullName.indexOf(" ", firstSpaceInName + 1);
//        int commaInName = userFullName.indexOf(",");
//
//
//        String userFirstName = userFullName.substring(0, firstSpaceInName);
//        String userSuffix = "";
//        String userMiddleName = "";
//        String userLastName = "";
//
//
//        if (commaInName != -1) {
//            // Only extract last name up to comma if space comes before comma
//            if (secondSpaceInName != -1 && secondSpaceInName < commaInName) {
//                userLastName = userFullName.substring(secondSpaceInName + 1, commaInName).trim();
//            } else {
//                userLastName = userFullName.substring(firstSpaceInName + 1, commaInName).trim();
//            }
//
//            userSuffix = userFullName.substring(commaInName + 1).trim();
//        } else {
//            userLastName = userFullName.substring(secondSpaceInName + 1).trim();
//            userSuffix = "(none)";
//        }
//
//
//
//
//        if(secondSpaceInName != -1 && userFullName.charAt(secondSpaceInName -1) != ','){
//            userMiddleName = userFullName.substring(firstSpaceInName + 1, secondSpaceInName);
//        }
//        else {
//            userMiddleName = "(none)";
//        }
//
//
//        System.out.println("First Name: " + userFirstName);
//        System.out.println("Middle Name: " + userMiddleName);
//        System.out.println("Last Name: " + userLastName);
//        System.out.println("Suffix: " + userSuffix);


///////////////////////////////////---- class practice ----///////////////////////////////////

     //   System.out.println(StringHelper.grabLastWord("Abraham Ghani").trim());



///////////////////////////////////---- Exercise 3 ----///////////////////////////////////

//        System.out.println("Enter game Score: ");
//        String gameScore = scanner.nextLine();
//
//        int colonIndex = gameScore.indexOf(":");
//        int pipeIndex = gameScore.indexOf("|");
//        int secondColonIndex = gameScore.indexOf(":", pipeIndex);
//        String team1 = gameScore.substring(0,colonIndex);
//        String team2 = gameScore.substring(colonIndex + 1, pipeIndex);
//        int team1Score = Integer.parseInt(gameScore.substring(pipeIndex + 1,secondColonIndex));
//        int team2Score = Integer.parseInt(gameScore.substring(secondColonIndex + 1));
//
//
//        if (team1Score > team2Score){
//            System.out.println(team1 + " has won the game");
//        } else if (team2Score > team1Score) {
//            System.out.println(team2 + " has beaten " + team1);
//        }
//        else {
//            System.out.println("Draw");
//        }


///////////////////////////////////---- Exercise 4 ----///////////////////////////////////


//        System.out.println("Please enter your full name:");
//        String fullName = scanner.nextLine();
//
//        System.out.println("What date will you be coming (MM/dd/yyyy):");
//        String date = scanner.nextLine();
//
//        System.out.println("How many tickets will you be purchasing:");
//        int ticket = scanner.nextInt();
//        scanner.nextLine();
//
//        int indexForFullName = fullName.indexOf(" ");
//        String firstName = fullName.substring(0, indexForFullName);
//        String lastName = fullName.substring(indexForFullName+1);
//        String formattedName = lastName + ", " + firstName;
//
//        int indexBeforeDay = date.indexOf("/");
//        int indexAfterDay = date.indexOf("/", indexBeforeDay+1);
//
//        String monthOfEvent = date.substring(0, indexBeforeDay);
//        String dayOfEvent = date.substring(indexBeforeDay+1,indexAfterDay-1);
//        String yearOfEvent = date.substring(indexAfterDay+1);
//        String formattedDate = String.format("%s-%s-%s",yearOfEvent,monthOfEvent,dayOfEvent);
//
//        System.out.println(ticket + " tickets('s) reserved for " + formattedDate + " under " + formattedName);



    }
}