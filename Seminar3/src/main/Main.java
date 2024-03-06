package main;

import singleton.Guvern;

public class Main {
    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(4,"Andrei",12);
        Guvern guvern2 = Guvern.getInstance(4,"Alex",12);
        System.out.println(guvern2);
        System.out.println(guvern);
    }
}