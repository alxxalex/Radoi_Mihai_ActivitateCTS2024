package program;

import clase.FactoryPersonal;
import clase.Medic;
import clase.PersonalSpital;
import clase.TipAngajat;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.creareTip(TipAngajat.MEDIC,"Andrei", BigDecimal.valueOf(5000),3);
        PersonalSpital asistent = factoryPersonal.creareTip(TipAngajat.ASISTENT,"Alex", BigDecimal.valueOf(4000),2);

        medic.afisare();
        asistent.afisare();
    }
}