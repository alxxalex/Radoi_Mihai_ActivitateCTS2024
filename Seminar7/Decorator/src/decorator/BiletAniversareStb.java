package decorator;

import clase.Bilet;
import clase.BiletAbstract;

public class BiletAniversareStb extends Decorator{
    public BiletAniversareStb(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void prinatre() {
        getBilet().prinatre();
        System.out.println("La multi ani STB");
    }

    @Override
    public void reducerePret() {
        ((Bilet)getBilet()).setPret(0);
    }
}
