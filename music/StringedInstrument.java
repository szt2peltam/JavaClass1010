package music;

public abstract class StringedInstrument extends Instrument{


    protected int numberOfStrings;
    protected String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    
    public StringedInstrument(String name, int numberOfStrings, String sound) {
        super(name);
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
    }

    public String sound(){
        System.out.println(sound);
        return sound;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
