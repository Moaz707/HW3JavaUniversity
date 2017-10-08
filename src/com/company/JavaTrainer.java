package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class JavaTrainer {
    boolean running = true;
    static ArrayList<String> userChoiceArrayList = new  ArrayList<>();//Saving the value of the user to check later
    static HashMap<String, String> javaDatas = new HashMap<>();
    JavaTrainer() { //Constructor
        javaDatas.put("object", "An object is a software bundle of related state and behavior. \n" +
                "        Software objects are often used to model the real-world objects that you find in everyday life.");
        javaDatas.put("class", "A class is a blueprint or prototype from which objects are created.");
        javaDatas.put("inheritance", " Inheritance provides a powerful and natural mechanism for organizing and structuring your software");
        javaDatas.put("interface", "An interface is a contract between a class and the outside world.\n" +
                "        When a class implements an interface, it promises to provide the behavior published by that interface. ");
        javaDatas.put("package", "A package is a namespace for organizing classes and interfaces in a logical manner.\n" +
                "         Placing your code into packages makes large software projects easier to manage.");
        Scanner scanner = promptUser(javaDatas);
        newMethod(scanner, javaDatas, running);
        //end of the Constructor
    }
    //End Method
    private static void quit() {
        System.out.println("Thank for using Java Trainer1.0");
        System.out.println("Hope to see you again");
        System.exit(0);
    }
    //First running and getting the first userValue
    private static Scanner promptUser(HashMap<String, String> javaDatas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Trainer1.0");
        System.out.println("what you do wanna hear today");
        String inputhear = scanner.next();
        System.out.println("dont waste your time, but let move on to our lessons today ");
        System.out.println(" today ,You learn on of these terms:");
        System.out.println();
        termsName(javaDatas); //showing the user the terms he will learn for now
        System.out.println("Which one of these you wanna start learn? ");
        System.out.println("you can write the name of terms as showing.");
        return scanner;
    }
    //check Method for userInput.
    private static void newMethod(Scanner scanner, HashMap<String, String> javaDatas, boolean running) {
        while (running) {
            String userChoice = scanner.next();//what choice he will learn
            if(userChoiceArrayList.contains(userChoice)==true &&  javaDatas.containsKey(userChoice) ){
                userChoiceArrayList.add( userChoice); //add the user choice to saved.
                System.out.println("You have learnt "+userChoice+" before.");
                System.out.println("Do you learned again? yes/no");
                String userTermsDecsion=scanner.next();
                switch (userTermsDecsion){
                    case "yes":
                        if (userChoice.toLowerCase().equals("object")) {
                            System.out.println("Interesting choice: ");
                            System.out.println(javaDatas.get("object"));
                            running = userChoiceToContinue(scanner, javaDatas, running);
                        } else if (userChoice.toLowerCase().equals("class")) {
                            System.out.println("Interesting choice: ");
                            System.out.println(javaDatas.get("class"));
                            running = userChoiceToContinue(scanner, javaDatas, running);
                        } else if (userChoice.toLowerCase().equals("inheritance")) {
                            System.out.println("Interesting choice: ");
                            System.out.println(javaDatas.get("inheritance"));
                            running = userChoiceToContinue(scanner, javaDatas, running);
                        } else if (userChoice.toLowerCase().equals("interface")) {
                            System.out.println("Interesting choice: ");
                            System.out.println(javaDatas.get("interface"));
                            running = userChoiceToContinue(scanner, javaDatas, running);
                        } else if (userChoice.toLowerCase().equals("package")) {
                            System.out.println("Interesting choice: ");
                            System.out.println(javaDatas.get("package"));
                            running = userChoiceToContinue(scanner, javaDatas, running);
                        } else {
                            System.out.print("Interesting choice:but its in ");
                            System.out.println(" Invalid choice,Please Choice one of the trems Has Been Showing ");
                            newMethod(scanner, javaDatas, running);
                        }
                    case "no":
                        System.out.println("so Choose another terms? ");
                        newMethod(scanner, javaDatas, running);
                }
            }
            else{
                userChoiceArrayList.add( userChoice); //ad the user choice to saved.
                if (userChoice.toLowerCase().equals("object")) {
                    System.out.println("Interesting choice: ");
                    System.out.println(javaDatas.get("object"));
                    running = userChoiceToContinue(scanner, javaDatas, running);
                } else if (userChoice.toLowerCase().equals("class")||userChoice.toLowerCase().equals("")) {
                    System.out.println("Interesting choice: ");
                    System.out.println(javaDatas.get("class"));
                    running = userChoiceToContinue(scanner, javaDatas, running);
                } else if (userChoice.toLowerCase().equals("inheritance")) {
                    System.out.println("Interesting choice: ");
                    System.out.println(javaDatas.get("inheritance"));
                    running = userChoiceToContinue(scanner, javaDatas, running);
                } else if (userChoice.toLowerCase().equals("interface")) {
                    System.out.println("Interesting choice: ");
                    System.out.println(javaDatas.get("interface"));
                    running = userChoiceToContinue(scanner, javaDatas, running);
                } else if (userChoice.toLowerCase().equals("package")) {
                    System.out.println("Interesting choice: ");
                    System.out.println(javaDatas.get("package"));
                    running = userChoiceToContinue(scanner, javaDatas, running);
                } else {
                    System.out.print("Interesting choice:but its in ");
                    System.out.println(" Invalid choice,Please Choice one of the trems Has Been Showing ");
                    newMethod(scanner, javaDatas, running);
                }
            }
        }
    }
    private static boolean userChoiceToContinue(Scanner scanner, HashMap<String, String> javaDatas, boolean running) {
        System.out.println("Will you wanna continue? yes/no");
        String askUser = scanner.next();
        switch (askUser) {
            case "yes":
                System.out.println("Choose another terms?");
                newMethod(scanner, javaDatas, running);
                break;
            case "no":
                quit();
                break;
        }
        return running;
    }
    public static void termsName(HashMap<String, String> javaDatas) {
        int i = 1;
        for (String key : javaDatas.keySet()) {
            System.out.print(i + "- " + key + ",\t");
            System.out.println();
            i++;
        }
    }
}