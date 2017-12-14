import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        System.out.println(arr[2]);
//        try{
//            System.out.println(1/0);
//        }
//        catch (ArithmeticException ae) {
//            System.out.println("维护中");
//            ae.printStackTrace();
//        }
        TestEx te = new TestEx();
        te.f2();
//        try{
//            new TestEx().m(0);
//        }
//        catch (ArithmeticException ee){
//            ee.printStackTrace();
//            System.out.println("chuchu");
//        }
//    }
        FileInputStream in = null;
        try {
            in = new FileInputStream("myli.txt");
            int b;
            b = in.read();
            while (b != -1) {
                System.out.println((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    void m(int i) throws ArithmeticException{
        if(i==0)
            throw new ArithmeticException("被除数为0");
    }
    void f() throws IOException{
        FileInputStream in = new FileInputStream("myfile.txt");
        int b;
        b =  in.read();
        while (b != -1){
            System.out.println((char) b);
            b = in.read();
        }
    }
    void f2() {
        try {
            f();
        }
        catch(FileNotFoundException e){
            System.out.println(e.fillInStackTrace());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
