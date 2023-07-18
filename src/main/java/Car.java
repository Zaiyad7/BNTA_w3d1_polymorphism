

public class Car extends Vehicle {
    private int numberOfWheels;


    public Car(String name){
        super(name);
    }

   public String drift(){
        return "Car can drift";
   }
   public String drift(String driftType){
        return "Car has " + driftType + " drifting";
   }
   public String repair(){
        return "Repairing a car";
   }

}
