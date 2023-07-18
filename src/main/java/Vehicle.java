import interfaces.IDrive;


public abstract class Vehicle implements IDrive {

    protected String name;

    public Vehicle(String name){
        this.name = name;

    }
    public abstract String repair();


    public String drive(String message){
        return "This is " + message;

    }
}
