package Fruits;

import java.util.Scanner;

import org.junit.Test;


public class apples {


    static String[] globalSphericalFruits;


    public static void main(String[] args) {

        questions();
        globalSphericalFruits = spherical();


        thinkOver();


    }

    public static void questions() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Good morning! We are running a study called " +
                "Apples are healthy and we would like you to fill this survey" +
                " about apples.");
        System.out.println("What colour of apples do you prefer?");
        System.out.println(" ");
        String colour = sc.next();
        System.out.println("I see... You prefer the " + colour + " ones...");
        System.out.print("How many apples can you eat in a row? (type a number)");
        System.out.println(" ");

        int numberapples = sc.nextInt();


        if (numberapples <= 2) {
            System.out.println("Whaaaat?? You can only eat " + numberapples + "??");

        } else if (numberapples > 2 && numberapples <= 5) {
            System.out.println("Well... " + numberapples + " apples is definitely not bad.");

        } else if (numberapples > 5) {
            System.out.println(numberapples + "??? Really? You are an apple master!!");
        }

        System.out.println("Ok, I'll keep asking. If at any point you need to leave " +
                "this survey, please type BYE");
        System.out.println("Are you ready to go on with it? Y/N");

    }

    public static String[] spherical() {

        String[] sphericalFruits = new String[11];
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        String s1;

        String goon = sc.next();

        if (goon.equalsIgnoreCase("Y")) {
            System.out.println("Ok.");

        } else {
            System.out.println("I don't care, to be honest. I'll go on anyway.");
            System.out.println("");
        }

        System.out.println("By, now, this is the next area we need to delve into.");
        System.out.println("APPLES ARE SPHERICAL.");
        System.out.println("Tell me what other spherical fruits you can recall.");
        System.out.println("Type them then press enter after each.");
        System.out.println("When you can't think of more, type FINISH.");


        s1 = sc.next();

        while (!(s1.equalsIgnoreCase("Bye") || (s1.equalsIgnoreCase("Finish")))) {
            sphericalFruits[counter] = s1;
            counter++;
            System.out.print("");
            s1 = sc.next();
        }

        if (s1.equalsIgnoreCase("BYE")) {
            System.out.println("You ruined this fucking survey. I hope you have a horrible day!");
        }

        if (s1.equalsIgnoreCase("FINISH")) {

            System.out.println("Thank you. You have come up with some spherical fruits. ");
            System.out.println("I would be proud of you but this doesn't actually prove anything ");
            System.out.println("further than your intellectual age is above 2 years old. Congrats anyway.");
            System.out.println("");//HERE I WOULD LIKE THE PROGRAM TO RUN THE NEXT LINE ONLY WHE THE USER PRESSES ENTER
        }
        return sphericalFruits;

    }

    public static void thinkOver() { //PER QUÈ NO EL TROBA?? perquè el globalsphericalfruits és fora
        // aquest mètode. l'hem posat a fora el main i l'hem convertit en static

        for (int i = 0; i < globalSphericalFruits.length; i++) {
            if (globalSphericalFruits[i] != null) {
                System.out.println(globalSphericalFruits[i]);
            }
        }
    }
}









