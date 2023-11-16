package dolgozat1116.novenyek;

public abstract class Noveny {
    private double vizmennyiseg;
    private String elnevezes;
    private Integer vizfelvetelszazalek;
    
    public Noveny(Double vizmennyiseg, String elnevezes) {
        this.vizmennyiseg = vizmennyiseg;
        this.elnevezes = elnevezes;
    }


    public Double getVizmennyiseg() {
        return vizmennyiseg;
    }


    public void setVizmennyiseg(Integer kapottviz) {
        double szazalekos = (double)vizfelvetelszazalek / 100.0;
        double noveles = kapottviz * szazalekos;
        this.vizmennyiseg += noveles;
    }


    public String getElnevezes() {
        return elnevezes;
    }


    public void setElnevezes(String elnevezes) {
        this.elnevezes = elnevezes;
    }


    public Integer getVizfelvetelszazalek() {
        return vizfelvetelszazalek;
    }


    public void setVizfelvetelszazalek(Integer vizfelvetelszazalek) {
        this.vizfelvetelszazalek = vizfelvetelszazalek;
    }

    public Boolean IsSzomjas(){
        return false;
    }

    

    
}
