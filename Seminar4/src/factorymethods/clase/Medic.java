package factorymethods.clase;

import java.math.BigDecimal;

public class Medic extends PersonalSpital {
    public Medic(String nume, BigDecimal salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println( "Medicul " + super.getNume() + " are salariul " + super.getSalariu() );

    }
}
