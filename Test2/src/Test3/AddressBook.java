package Test3;

import java.io.*;

public class AddressBook implements Serializable, Cloneable{
    public String Fname, Lname, Email;
    public long Pnumber;
    public AddressBook(String f, String l, String e, long p){
        Fname = f;
        Lname = l;
        Email = e;
        Pnumber = p;
    }
    public AddressBook clone(){
        return new AddressBook(Fname, Lname, Email, Pnumber);
    }
    public boolean equals(AddressBook a){
        return Fname.equals(a.Email) && Lname.equals(a.Lname) && Email.equals(a.Email)
                && Pnumber == a.Pnumber;

    }

public String toString(){
        return Pnumber + Email + Lname + Fname;
}
    public static void main(String[] args) throws FileNotFoundException, IOException{
        AddressBook p = new AddressBook("Jiawei", "Wang", "Peterwangjiawei@gmail.com", 555111);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("addrbook.ser"));
        oos.writeObject(p);
        oos.close();

        AddressBook p2 = p.clone();
        System.out.println(p.equals(p2));
        System.out.println(p2);


    }

}
