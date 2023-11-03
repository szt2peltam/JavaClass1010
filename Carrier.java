import java.util.ArrayList;

public class Carrier {
    

    private ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();

    private int ammo;
    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    private int hp;
    public Carrier(int ammo, int hp) {
        this.ammo = ammo;
        this.hp = hp;
    }

    public void Add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }


    public void Fill() throws Exception{
        if(getAmmo() == 0) throw new Exception("No ammo!");

        if(IsThereEnoughAmmoToFillAircrafts()){
            for (Aircraft aircraft : aircrafts) {
                setAmmo(aircraft.refillAmmo(ammo));
                
            }
        }else{
            for (int i = 0; i < 2; i++) {

                for (Aircraft aircraft : aircrafts) {
                    if(i == 0){
                        if(aircraft.isPriority()){
                            if(IsThereEnoughAmmoToAnFillAircraft(aircraft)){
                                setAmmo(aircraft.refillAmmo(ammo));
                            }
                        }
                    }else{
                        if(IsThereEnoughAmmoToAnFillAircraft(aircraft)){
                            setAmmo(aircraft.refillAmmo(ammo));
                        }
                    }
                }
            }
        }
    }

    public Boolean IsThereEnoughAmmoToFillAircrafts(){

        int RemainingAmmo = getAmmo();
        for (Aircraft aircraft : aircrafts) {
            if(aircraft.getAmmo() == 0){
                RemainingAmmo -= aircraft.getMaxAmmo();
            }
        }

        if(RemainingAmmo<=0) return false;
        return true;
    }
    public Boolean IsThereEnoughAmmoToAnFillAircraft(Aircraft aircraft){

        int RemainingAmmo = getAmmo();
        if(aircraft.getAmmo() == 0){
            RemainingAmmo = RemainingAmmo - aircraft.getMaxAmmo();
        }
        if(RemainingAmmo<=0) return false;
        return true;
    }


    public void Fight(Carrier enemyCarrier){

        for (Aircraft aircraft : aircrafts) {
            enemyCarrier.setHp(enemyCarrier.getHp() - aircraft.fight());
        }
    }


    public String getStatus(){
        if(getHp() == 0) return "It's dead Jim:(";
        int totaldamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totaldamage += aircraft.getAmmo() * aircraft.getBaseDamage();
        }
        String result = "HP: " + getHp() + "\nAircraft count: " + 
                        aircrafts.size()+"\n" + "Ammo Storage: "
                        + getAmmo() + "\nTotal damage:" + totaldamage +
                        "\nAircrafts : ";

        for (Aircraft aircraft : aircrafts) {
            result += "\n" + aircraft.getStatus();
        }

        return result;
    }
}
