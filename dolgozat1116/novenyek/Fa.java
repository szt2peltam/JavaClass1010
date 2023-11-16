package dolgozat1116.novenyek;

public class Fa extends Noveny{

    public Fa(double vizmennyiseg, String elnevezes) {
        super(vizmennyiseg, elnevezes);
        setVizfelvetelszazalek(40);
    }
    


    @Override
    public Boolean IsSzomjas(){
        if(getVizmennyiseg() < 10) return true;
        return false;
    }
}
