package decorator;

import clase.Bilet;
import clase.BiletAbstract;

public class BiletSarbatori extends Decorator{
    private static int discount=10;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void prinatre() {
      getBilet().prinatre();
        System.out.println("Sarbatori fericite!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)getBilet()).setPret((((Bilet)getBilet()).getPret() - discount));
    }
}
