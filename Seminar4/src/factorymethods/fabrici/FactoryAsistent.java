package factorymethods.fabrici;

import factorymethods.clase.Asistent;
import factorymethods.clase.PersonalSpital;

import java.math.BigDecimal;

public class FactoryAsistent implements FactoryPersonal {

    @Override
    public PersonalSpital creareAngjat(String nume, BigDecimal salariu) {
        return new Asistent(nume,salariu);
    }
}
