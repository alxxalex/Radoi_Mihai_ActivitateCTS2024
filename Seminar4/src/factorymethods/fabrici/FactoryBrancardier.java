package factorymethods.fabrici;

import factorymethods.clase.Brancardier;
import factorymethods.clase.PersonalSpital;

import java.math.BigDecimal;

public class FactoryBrancardier implements FactoryPersonal{
    @Override
    public PersonalSpital creareAngjat(String nume, BigDecimal salariu) {
        return new Brancardier(nume,salariu);
    }
}
