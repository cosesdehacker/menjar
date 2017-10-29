package Fruits;

import java.util.Scanner;

public class apples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Good morning! We are running a study called " +
                "Apples are healthy and we would like you to fill this survey" +
                " about apples.");
        System.out.println("What colour of apples do you prefer?");
        String colour = sc.next();
        System.out.println("I see... You prefer the " + colour + " ones...");
        System.out.print("How many apples can you eat in a row?");

        int numberapples = sc.nextInt();


        if (numberapples <= 2) {
            System.out.println("Whaaaat?? You can only eat " + numberapples + "??");

        } else if (numberapples > 2 && numberapples <= 5) {
            System.out.println("Well... " + numberapples + " apples is definitely not bad.");

        } else if (numberapples > 5){
            System.out.println(numberapples + "??? Really? You are an apple master!!");
        }

        System.out.println ("Ok, I'll keep asking. If at any point you need to leave " +
                "this survey, please type I'M FED UP WITH THIS SURVEY.");
        System.out.println ("By, now, this is the next area we need to delve into.");
        System.out.println ("Apples are spherical.");
        System.out.println ("Tell me what other spherical fruits you can recall.");
        System.out.println ("Type them then press enter after each.");
        System.out.println ("When you can't think of more, type FINISH.");

        //NO SURT, PERÒ HE D'ANAR A COMPRAR :P

        /*while (sc.hasNext()) {

        String s1=sc.next();

        if (s1.equals("I'M FED UP WITH THIS SURVEY")) {
            break; }

            while (sc.hasNext()) {

                String s2=sc.next();

                if (s2.equals ("FINISH")) {
                    break; }

                System.out.println("baaaaah");}

            System.out.println("Thank you. You have come up with some spherical fruits. ");
            System.out.println("I would be proud of you but this doesn't actually prove anything ");
            System.out.println("further than your intellectual age is above 2 years old. Congrats anyway."); }

        System.out.println ("You ruined this fucking survey. I hope you have a horrible day!"); */

    }

}