package factorymethods.clase;

import java.math.BigDecimal;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume, BigDecimal salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println( "Infirmierul " + super.getNume() + " are salariul " + super.getSalariu());

    }
}
