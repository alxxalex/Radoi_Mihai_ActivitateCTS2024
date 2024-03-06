package singleton;

public class Guvern {

    private static Guvern instanta =null;
    private int nrGuvernatori;
    private String numePrimMinistru;
    private int nrLuni;

    private Guvern(int nrGuvernatori, String numePrimMinistru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePrimMinistru = numePrimMinistru;
        this.nrLuni = nrLuni;
    }

    public synchronized static Guvern getInstance(int nrGuvernatori, String numePrimMinistru, int nrLuni){
        if(instanta == null){
            instanta = new Guvern(nrGuvernatori,numePrimMinistru,nrLuni);
        }
        return instanta;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guvern{");
        sb.append("nrGuvernatori=").append(nrGuvernatori);
        sb.append(", numePrimMinistru='").append(numePrimMinistru).append('\'');
        sb.append(", nrLuni=").append(nrLuni);
        sb.append('}');
        return sb.toString();
    }
}
