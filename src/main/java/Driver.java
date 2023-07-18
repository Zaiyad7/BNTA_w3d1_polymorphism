import interfaces.IDrive;

public class Driver implements IDrive {
    private String name;


    public Driver(String name){
        this.name = name;
    }
    public String drive(String message){
        return "This vehicle is " + message;
    }

}
