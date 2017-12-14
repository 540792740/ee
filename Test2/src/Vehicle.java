interface IVehicle {
    public double payToll();
    public double getTime();
}
abstract class Vehicle implements IVehicle{
    private double time;
    private String number;
    public Vehicle(double t, String n){
        time = t;
        number = n;
    }
public String getnumber(){
        return number;
}
public double getTime(){
    return time;
}
public abstract String print();


}
