public class Helicopter extends Vehicle{

    private int numberOfBlades;

    public Helicopter(String name){
        super(name);
    }

    public boolean canHover(){
        return true;
    }

    public String repair(){
        return "Repairing a helicopter";
    }

}
