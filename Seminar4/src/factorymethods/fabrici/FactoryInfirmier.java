package factorymethods.fabrici;

import factorymethods.clase.Infirmier;
import factorymethods.clase.PersonalSpital;

import java.math.BigDecimal;

public class FactoryInfirmier implements FactoryPersonal{
    @Override
    public PersonalSpital creareAngjat(String nume, BigDecimal salariu) {
        return new Infirmier(nume,salariu);
    }
}
