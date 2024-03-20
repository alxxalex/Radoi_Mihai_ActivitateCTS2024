package factorymethods.fabrici;

import factorymethods.clase.PersonalSpital;

import java.math.BigDecimal;

public interface FactoryPersonal {
    PersonalSpital creareAngjat(String nume, BigDecimal salariu);
}
