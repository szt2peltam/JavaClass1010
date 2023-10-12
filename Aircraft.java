public class Aircraft {
    private String type;
    private int maxAmmo;
    
    private int ammo;
    private int baseDamage;
    private int remainingAmmo;
    
    
    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.ammo = 0;
        this.baseDamage = baseDamage;
    }
    public int getMaxAmmo() {
        return maxAmmo;
    }
    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }
    public int getremainingAmmo() {
        return remainingAmmo;
    }
    
    public void setremainingAmmo(int remainingAmmo) {
        this.remainingAmmo = remainingAmmo;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAmmo() {
        return ammo;
    }
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }


    public int fight(){
        int damage = getBaseDamage() * getAmmo();

        setAmmo(0);

        return damage;
    }

    public int refillAmmo(int AmmoFromTheStation){
        setAmmo(getMaxAmmo());

        setremainingAmmo(AmmoFromTheStation - getMaxAmmo());

        return AmmoFromTheStation - getMaxAmmo();
    }

    public String getStatus(){
        return "Type:"+getType()+", Ammo:"+getAmmo()+", Base Damage: " + getBaseDamage()+", All Damage: "+(getAmmo()*getBaseDamage());
    }

    public Boolean isPriority(){
        if(getType()=="F35")return true;
        else return false;
    }
}   
