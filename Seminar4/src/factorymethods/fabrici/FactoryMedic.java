package factorymethods.fabrici;

import factorymethods.clase.Medic;
import factorymethods.clase.PersonalSpital;

import java.math.BigDecimal;

public class FactoryMedic implements FactoryPersonal{
    @Override
    public PersonalSpital creareAngjat(String nume, BigDecimal salariu) {
        return new Medic(nume,salariu);
    }
}
