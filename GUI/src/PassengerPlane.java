public class PassengerPlane extends Airplane{

    public void serveCoffee() {

        System.out.print("Coffee or tea?");
    }
    public PassengerPlane(double fuel){
        super(fuel);            //超类继承，可以继承private//



    }
     public static void main (String[] args){
        Airplane a = new Airplane(50);
        a.fly();
        PassengerPlane p = new PassengerPlane(60);
        p.fly();
        p.serveCoffee();




    }

}
