package factorymethods.clase;

import java.math.BigDecimal;

public abstract class PersonalSpital {

    private String nume;
    private BigDecimal salariu;

    public PersonalSpital(String nume, BigDecimal salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afisare();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public BigDecimal getSalariu() {
        return salariu;
    }

    public void setSalariu(BigDecimal salariu) {
        this.salariu = salariu;
    }
}
