public class Airplane {

    private double fuel;

    public Airplane(double fuel){
        if(fuel < 0)
            throw new RuntimeException("Airplane must be charged");
        this.fuel = fuel;
    }

    public void fly(){
        fuel--;
        if (fuel < 0)
            crash();
        System.out.println("Flying");
    }
    public void crash(){
        System.out.print("crash");
    }
    public static void main(String[] args){
        Airplane a = new Airplane(50);
        while (true)
        a.fly();

    }

}
