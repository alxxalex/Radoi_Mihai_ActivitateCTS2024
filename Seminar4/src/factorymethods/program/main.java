package factorymethods.program;

import factorymethods.clase.PersonalSpital;
import factorymethods.fabrici.FactoryAsistent;
import factorymethods.fabrici.FactoryInfirmier;
import factorymethods.fabrici.FactoryMedic;
import factorymethods.fabrici.FactoryPersonal;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryAsistent();
        procesareAngajati(factoryPersonal,"rares", BigDecimal.valueOf(2000));
        procesareAngajati(new FactoryMedic(),"alex", BigDecimal.valueOf(3000));
        procesareAngajati(new FactoryInfirmier(),"andrei", BigDecimal.valueOf(3000));
    }

    private static void procesareAngajati(FactoryPersonal factoryPersonal,String nume, BigDecimal salariu){
        PersonalSpital angajat = factoryPersonal.creareAngjat(nume,salariu);
        angajat.afisare();
    }
        
}

