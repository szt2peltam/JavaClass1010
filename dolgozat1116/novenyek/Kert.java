package dolgozat1116.novenyek;

import java.util.ArrayList;

public class Kert {
    
    public static void main(String[] args) {
        Virag sarga = new Virag(0, "sárga virág");
        Virag kek = new Virag(0, "kék virág");
        Fa narancs = new Fa(0, "narancs fa");
        Fa lonc = new Fa(0, "lonc fa");

        Kert kert = new Kert();
        kert.AddNovenyToKert(sarga);
        kert.AddNovenyToKert(kek);
        kert.AddNovenyToKert(lonc);
        kert.AddNovenyToKert(narancs);
        kert.Ontoz(40);
        kert.Ontoz(70);
    }
    private ArrayList<Noveny> novenyek;

    public Kert() {
        this.novenyek = new ArrayList<Noveny>();
    }

    public ArrayList<Noveny> getNovenyek() {
        return novenyek;
    }

    public void AddNovenyToKert(Noveny noveny){
        novenyek.add(noveny);
    }
    
    public void Ontoz(Integer vizmennyiseg){

        Integer szomjasak = HowManySzomjas();
        if(szomjasak != 0){
            Integer eloszlas = vizmennyiseg / szomjasak;
            for (Noveny noveny : novenyek) {
                if(noveny.IsSzomjas()){
                    noveny.setVizmennyiseg(eloszlas);
                }
            }
        }


        kertAllapot();
    }
    
    private Integer HowManySzomjas(){
        Integer a = 0;
        for (Noveny noveny : novenyek) {
            if(noveny.IsSzomjas()) a++;
        }

        return a;
    }
    public void kertAllapot(){
        for (Noveny noveny : novenyek) {
            if(noveny.IsSzomjas()){
                System.out.println(noveny.getElnevezes()+"-nak vízre van szüksége.");
            }else{
                System.out.println(noveny.getElnevezes()+"-nak nincs szüksége vízre.");
            }
        }
        System.out.println();
    }

    


}
