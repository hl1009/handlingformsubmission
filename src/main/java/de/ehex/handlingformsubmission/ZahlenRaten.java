package de.ehex.handlingformsubmission;


import java.util.Scanner;

public class ZahlenRaten {

    static void rateZahl(int wertebereich) {
        int zufallsZahl = (int) (Math.random() * wertebereich);

        System.out.println(zufallsZahl);
        Scanner scanner = new Scanner(System.in);

        int eingabe = 0;
        int zaehler = 0;

        do {
            System.out.println("Gib eine Zahl zwischen 0 und " + wertebereich + " ein!");
            eingabe = scanner.nextInt();
            zaehler++;
            if (zufallsZahl == eingabe) {
                System.out.println("Richtig! Du hast " + zaehler + " Durchgänge benötigt.");
            } else if (zufallsZahl < eingabe) {
                System.out.println("Du liegst falsch! Die zu erratende Zahl ist kleiner");
            } else {
                System.out.println("Du liegst falsch! Die zu erratende Zahl ist größer");
            }
        }
        while (zufallsZahl != eingabe);
    }

    public static void main(String[] args) {
        rateZahl(100);
    }
}