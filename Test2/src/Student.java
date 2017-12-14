interface singer{
    public void sing();
    public void sleep();
}

class people implements singer{
    private String name;
    public people(String name){
        this.name = name;
    }
    public void sing(){
        System.out.println("sing...");
    }
    public void sleep(){
        System.out.println("sleep...");
    }
}

public class Student {
    public static void main(String[] args){
        people s1 = new people("SD");
        s1.sing();
        s1.sleep();

    }
}