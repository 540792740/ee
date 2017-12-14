import java.util.ArrayList;
import java.util.List;

public class Parking {
    public static void main(String[] args){
        List<Vehicle> ls = new ArrayList<>();
        ls.add(new Car(1.0,"NNNNNN", "RED" ));
        ls.add(new Bus(2,"MMMMMM", 22));
//        ls.add(new Truck(3,"JJJJJJ", 67));
        for(int i = 0; i < ls.size(); i++){
            Vehicle v =ls.get(i);
            System.out.println(v);
            System.out.println(v.print());

        }
    }
}

class Car extends Vehicle {
    private String color;
    public Car(double t, String n, String c) {
        super(t, n);
        color = c;
    }
    public String toString(){
        return "Car";
    }
    public double payToll(){
        return 15*super.getTime();
    }
    public String print(){
        return "i am a Car \nmy number is " + super.getnumber() + "";
    }
}


class Bus extends Vehicle{
    private double quantity;
    public Bus(double t, String n, double q){
        super(t, n);
        quantity = q;
    }
    public String toString() {
        return "Bus";
    }
    public String print(){
        return "i am a Bus,\nmy number is "+ super.getnumber() + "\nmy pay is " + 25*super.getTime();
    }
    public double payToll(){
        return 25 * super.getTime();
    }
}

