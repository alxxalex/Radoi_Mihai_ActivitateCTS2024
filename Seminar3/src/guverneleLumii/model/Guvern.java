package guverneleLumii.model;

public class Guvern {
    private String numeTara;
    private  String numePrimMinistru;
    private int nrGuvernatori;

    protected Guvern(String numeTara, String numePrimMinistru, int nrGuvernatori) {
        this.numeTara = numeTara;
        this.numePrimMinistru = numePrimMinistru;
        this.nrGuvernatori = nrGuvernatori;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public String getNumePrimMinistru() {
        return numePrimMinistru;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public int getNrGuvernatori() {
        return nrGuvernatori;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guvern{");
        sb.append("numeTara='").append(numeTara).append('\'');
        sb.append(", numePrimMinistru='").append(numePrimMinistru).append('\'');
        sb.append(", nrGuvernatori=").append(nrGuvernatori);
        sb.append('}');
        return sb.toString();
    }
}
