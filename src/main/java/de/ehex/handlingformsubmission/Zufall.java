package de.ehex.handlingformsubmission;

public class Zufall {
    private static long schaetzen;


    public long getSchaetzen() {

        return schaetzen;
    }

    public void setSchaetzen(long schaetzen) {
        this.schaetzen = schaetzen;
    }



 private  static int zufallsZahl = (int) (Math.random() * 100 + 1);

    public int getZufallsZahl() {
        return zufallsZahl;
    }

    public String getErgebniss() {
        if (schaetzen == zufallsZahl) {
            return "Richtig geraten";

        } else if (schaetzen > zufallsZahl) {
            return "Die gesuchte Zahl ist kleiner";

        } else if (schaetzen < zufallsZahl) {
            return "Die gesuchte Zahl ist groesser";
        }
        else if (schaetzen > 100 ||schaetzen <0) {
            return "Die gesuchte Zahl muss zwischen 0 und 100 liegen ";
        }
        return null;
    }
    public void resetZufallssZahl(){
        zufallsZahl = (int) (Math.random() * 100 + 1);
    }
}
