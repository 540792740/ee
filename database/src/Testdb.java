import java.util.*;

public class Testdb {
    public static void main(String[] arg) {
        List<Shape> ls = new ArrayList<>();
        ls.add(new Cube(8));
        ls.add(new Cylinder(10, 10));
        for(Shape e : ls) {
            e.print();
            System.out.println(e.volum());
        }
        for(int i = 0; i < ls.size(); i++) {
            ls.get(i).print();
        }
        Iterator<Shape> it = ls.iterator();
        while(it.hasNext()) {
            it.next().print();
        }
    }
}

interface Shape{
    public void print();
    public double volum();
}

class Cylinder implements Shape {
    private double r, h;
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public void print() {
        System.out.println("I am a Cylinder");
    }
    public double volum() {
        return 3.14 * r * r * h;
    }
}

class Cube implements Shape {
    private double h;
    public Cube(double h) {
        this.h = h;
    }
    public void print() {
        System.out.println("I am a Cube");
    }
    public double volum() {
        return h *  h * h;
    }
}