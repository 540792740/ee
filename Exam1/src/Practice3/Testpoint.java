package Practice3;

public class Testpoint {
    public static void main(String[] args){
        point t = new point(0.0,0.0,0.0);
        point t1 = new point(1.0,2.0,3.0);
        t1.setX(5.0);
        System.out.println(t.getDistance(t1));
    }
}

class point{
    double x, y, z;
    point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setX(double x){
        this.x = x;
    }
    double getDistance(point p){
        return Math.sqrt((x -p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z- p.z)*(z- p.z));

    }

}
