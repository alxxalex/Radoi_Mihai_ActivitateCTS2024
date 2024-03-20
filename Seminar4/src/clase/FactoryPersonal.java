package clase;

import java.math.BigDecimal;

public class FactoryPersonal {

    public PersonalSpital creareTip(TipAngajat tipAngajat, String nume, BigDecimal salariu, int vechime) {
        return switch (tipAngajat) {
            case BRANCARDIER -> new Brancardier(nume, salariu);
            case MEDIC -> new Medic(nume, salariu,vechime);
            case ASISTENT -> new Asistent(nume, salariu);
            case INFIRMIER -> new Infirmier(nume, salariu);
        };
    }
}
