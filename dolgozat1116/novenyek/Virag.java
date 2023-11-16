package dolgozat1116.novenyek;

public class Virag extends Noveny {

    public Virag(double vizmennyiseg, String elnevezes) {
        super(vizmennyiseg, elnevezes);
        setVizfelvetelszazalek(75);
    }
    @Override
    public Boolean IsSzomjas(){
        if(getVizmennyiseg() < 5) return true;
        return false;
    }

}
