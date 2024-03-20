package clase;

import java.math.BigDecimal;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume, BigDecimal salariul) {
        super(nume,salariul);
    }

    @Override
    public void afisare() {
        System.out.println( "Brancardierul " + super.getNume() + " are salariul " + super.getSalariu());
    }
}
