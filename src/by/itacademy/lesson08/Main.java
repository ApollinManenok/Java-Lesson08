package by.itacademy.lesson08;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your line\n>>> "); //Hello How are you Hello I am fine and you I am great Thanks
        TextInspector text = new TextInspector(scan.nextLine());
        text.printSet();
        boolean term = true;
        while (term) {
            System.out.print("Enter word you want to check: ");
            term = text.checkWord(scan.nextLine());
        }
    }
}
