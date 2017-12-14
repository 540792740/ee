import java.io.*;
import java.util.*;

public class AddressBook implements Cloneable, Serializable{
    public static void main(String[] args)throws FileNotFoundException, IOException {
        List<AddressBook> a = new ArrayList<>();
        a.add(new AddressBook("jiawei", "wang", "5@gmail.com",11231));
        a.add(new AddressBook("Jiawei", "Wang", "6@gmail.com",1231));
        System.out.println(a);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("add.ser"));
        oos.writeObject(a);
        oos.close();
        AddressBook a2 = new AddressBook("jiawei", "wang", "5@gmail.com",11231);
        AddressBook a3 = a2.clone();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(a3);
        System.out.println(" ");
        System.out.println(" ");
        for(AddressBook e : a){

            e.print();
        }
    }
    public String toString(){
        return fn + " "+ ln + " "+ " " + email + " " + pn;
    }
    public void print(){
        System.out.println(fn + " "+ ln + " "+ " " + email + " " + pn);
    }

    public String fn, ln, email;
    public long pn;
    public AddressBook(String fn, String ln, String email, long pn){
        this.fn = fn;
        this.ln = ln;
        this.email = email;
        this.pn = pn;
    }
    public AddressBook clone(){
        return new AddressBook(fn, ln, email, pn);
    }
    public boolean equals(AddressBook b){
        return fn.equals(b.fn) &&
                ln.equals(b.ln) &&
                email.equals(b.email) &&
                pn == b.pn;
    }
}
