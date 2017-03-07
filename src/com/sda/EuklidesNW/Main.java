package com.sda.EuklidesNW;

public class Main {

    public static int nwd (int a, int b) {

        while (b != a ) {
            if (a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }

    public static int euklidesNWW (int a, int b) {
        return a/nwd(a,b)*b;
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 36;

        System.out.println("Wynik NWW: " + euklidesNWW(a, b));
    }
}
