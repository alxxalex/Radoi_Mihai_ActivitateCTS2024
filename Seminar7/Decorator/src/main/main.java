package main;

import clase.Bilet;
import clase.BiletAbstract;
import decorator.BiletAniversareStb;
import decorator.BiletSarbatori;
import decorator.Decorator;

public class main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(30,"adasdc");
        printareBilet(bilet);

        Decorator decorator = new BiletSarbatori(bilet);
        decorator.reducerePret();
        printareBilet(decorator);

        Decorator decorator1 = new BiletAniversareStb(decorator);
        printareBilet(decorator1);
    }

    public static void printareBilet(BiletAbstract bilet){
        bilet.prinatre();
    }
}
