package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Quiz {
    private static List <Questions> question = new ArrayList <>();

    public Quiz() {


        Questions one = new Questions("q1", " What is correct syntax for main method of a java class?" + "\nA. public static int main(String[] args)" + "\nB. public int main(String[] args)" + "\nC. public static void main(String[] args)");
        one.addans("A", false);
        one.addans("B", false);
        one.addans("C", true);

        Questions two = new Questions("q2", "What is the size of float variable?" + "\nA. 8 bit" + "\nB. 16 bit" + "\nC. 32 bit");
        two.addans("A", false);
        two.addans("B", false);
        two.addans("C", true);


        Questions three = new Questions("q3", "What is the default value of byte variable?" + "\nA. 0" + "\nB. 0.0" + "\nC. null");
        three.addans("A", true);
        three.addans("B", false);
        three.addans("C", false);

        Questions four = new Questions("q4", "Method Overloading is an example of" + "\nA. Dynamic Binding." + "\nB. Static Binding." + "\nC. null");
        four.addans("A", false);
        four.addans("B", true);
        four.addans("C", false);

        Questions five = new Questions("q5", "What are Wrapper classes?" + "\nA. These are classes that allow primitive types to be accessed as objects" + "\nB. These are classes that wraps functionality of an existing class." + "\nC. both of the above");
        five.addans("A", false);
        five.addans("B", true);
        five.addans("C", false);

        question.add(one);
        question.add(two);
        question.add(three);
        question.add(four);
        question.add(five);
        gogogo();
    }


    public static void gogogo() {
        for (int i = 0; i < question.size(); i++) {
            Questions x = question.get(i);
            System.out.println(x.getQuestionnumber() + " " + x.getQuestion());


            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("choose an answer");
                String F = scan.nextLine();
                String correctOrWrong = x.iscorrect(F);
                try {
                    if (correctOrWrong.equalsIgnoreCase("correct")) {
                        System.out.println("correct");
                        break;
                    } else
                        System.out.println("wrong");

                } catch (NullPointerException e) {

                }
            }
        }
    }
}


