package factorymethods.clase;

import java.math.BigDecimal;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, BigDecimal salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println( "Asistentul " + super.getNume() + " are salariul " + super.getSalariu());

    }
}
