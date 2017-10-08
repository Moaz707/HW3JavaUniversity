package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("choose 1: Quiz" + "\n" + "choose 2: for Java Trainer");
            int chosen = scan.nextInt();
            if (chosen == 1) {
                Quiz x = new Quiz();
                break;
            } else if (chosen == 2) {
                JavaTrainer javaTrainer = new JavaTrainer();
                break;
            }
        }


    }
}










