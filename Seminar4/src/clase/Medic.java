package clase;

import java.math.BigDecimal;

public class Medic extends PersonalSpital{
    private int vechime;
    public Medic(String nume, BigDecimal salariu) {
        super(nume, salariu);
        this.vechime = 0;
    }

    public Medic(String nume, BigDecimal salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public void afisare() {
        System.out.println( "Medicul " + super.getNume() + " are salariul " + super.getSalariu() + " si o vechime de " + vechime);

    }
}
