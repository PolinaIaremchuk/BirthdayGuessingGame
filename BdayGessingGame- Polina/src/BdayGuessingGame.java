/*
 * Program 1
 * Polina Iaremchuk
 * 01/13/2024
 * Assignment: Birthday Guessing Game
 * CSC 1120, 1st section
 * */
//External Library
import java.util.Scanner;
public class BdayGuessingGame {
    //main method
    public static void main(String[] args) {
//method body
//Scanner Class
        Scanner input = new Scanner(System.in);
        int result;
        int i = 0;
//Present a card 0 to the user
        System.out.println("Hey! Let me guess your birth date!");
        System.out.println("Do you see your birth date in card 0?");
        System.out.println("CARD 0");
        System.out.println("1 3 5 7");
        System.out.println("9 11 13 15");
        System.out.println("17 19 21 23");
        System.out.println("25 27 29 31");
        System.out.println("If your birth date is on a card 0, press 1. If not, press 0.");
        result = input.nextInt();
        if (result == 1) {
            System.out.println("Value is seen in card 0");
            i = i + 1;
        } else {
            System.out.println("Value is not seen in the card 0 .");
        }
//Present a card 1 to the user
        System.out.println("Do you see your birth date in card 1?");
        System.out.println("CARD 1");
        System.out.println("2 3 6 7");
        System.out.println("10 11 14 15");
        System.out.println("18 19 22 23");
        System.out.println("26 27 30 31");
        System.out.println("If your birth date is on a card 1, press 1. If not, press 0.");
        result = input.nextInt();
        if (result == 1) {
            System.out.println("Value is seen in card 1");
            i = i + 2;
        } else {
            System.out.println("Value is not seen in the card 1.");
        }
        System.out.println("If your birth date is on a card 1, press 1. If not, press 0.");
//Present a card 2 to the user
        System.out.println("Do you see your birth date in card 2?");
        System.out.println("CARD 2");
        System.out.println("4 5 6 7");
        System.out.println("12 13 14 15");
        System.out.println("20 21 22 23");
        System.out.println("28 29 30 31");
        System.out.println("If your birth date is on a card 2, press 1. If not, press 0.");
        result = input.nextInt();
        if (result == 1) {
            System.out.println("Value is seen in card 2");
            i = i + 4;
        } else {
            System.out.println("Value is not seen in the card 2.");
        }
//Present a card 3 to the user
        System.out.println("Do you see your birth date in card 3?");
        System.out.println("CARD 3");
        System.out.println("8 9 10 11");
        System.out.println("12 13 14 15");
        System.out.println("24 25 26 27");
        System.out.println("28 29 30 31");
        System.out.println("If your birth date is on a card 3, press 1. If not, press 0.");
        result = input.nextInt();
        if (result == 1) {
            System.out.println("Value is seen in card 3");
            i = i + 8;
        } else {
            System.out.println("Value is not seen in the card 3.");
        }
//Present a card 4 to the user
        System.out.println("Do you see your birth date in card 4?");
        System.out.println("CARD 4");
        System.out.println("16 17 18 19");
        System.out.println("20 21 22 23");
        System.out.println("24 25 26 27");
        System.out.println("28 29 30 31");
        System.out.println("If your birth date is on a card 4, press 1. If not, press 0.");
        result = input.nextInt();
        if (result == 1) {
            System.out.println("Value is seen in card 4");
            i = i + 16;
        } else {
            System.out.println("Value is not seen in the card 4.");
        }
        System.out.println("Your birth date is : " + i);
    }
}