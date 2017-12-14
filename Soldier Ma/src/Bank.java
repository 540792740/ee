import java.io.*;
import java.util.*;

public class Bank implements Serializable, Cloneable{

    public static void main(String[] args) throws FileNotFoundException, IOException{
        List<customer> ls = new ArrayList<>();
        ls.add(new depositor("Dingdong", "123455", 10000));
        ls.add(new depositor("Mingxin", "122455", 199000));
        ls.add(new borrower("XXX", 2012,12,12,1431));
        ls.add(new borrower("King", 2017,7, 12, 99999));

        borrower d1 = new borrower("wangjiawei", 2017,12,12,99999);
        borrower d2 = d1.clone();
        ls.add(d2);
        System.out.println(d1.equals(d2));
        for(customer e : ls){
            e.print();
        }
        ObjectOutputStream oos = new ObjectOutputStream
               (new FileOutputStream("addrbook.ser"));
                oos.writeObject(ls);

    }
}


interface customer{
    public void print();

}

class depositor implements customer{
    private String name;
    private String account;
    private double amount;
    public depositor clone(){
        return new depositor(name, account, amount);
    }
    public boolean equals(depositor a){
        return name.equals(a.name) && account.equals(a.account) &&
                amount== (a.amount);
    }



    public depositor(String name, String account, double amount){
        this.account =account;
        this.name = name;
        this.amount = amount;
    }
    public void print(){
        System.out.println("Depositor's name is " + name + "\nDepositor's account is " + account + "\nDepositor's amount is $" + amount);

    }
}

class borrower implements customer{
    private String name;
    private double amount;
    private Date date;
    class Date{
        private int year, month, day;
        public Date(int year, int month, int day){
            this.year= year;
            this.month = month;
            this.day = day;
            System.out.println(month + "/" + day + "/" + year);
        }
        public boolean equals(Date d){
            return year == d.year &&
                    month == d.month &&
                    day == d.day;
        }
        public Date(Date d){
            year = d.year;
            day = d.day;
            month = d.month;
        }
    }
    public borrower(String name, int year, int month, int day, double amount){
        this.name = name;
        this.date = new Date(year, month, day);
        this.amount = amount;
    }

    public borrower(String name, Date date, double amount){
        this.name = name;
        this.date = new Date(date);
        this.amount = amount;
    }
    public void print(){
        System.out.println("Borrower's name is " + name + "\nBorrower's data is " + this.date + "\nBorrower's amount is " + amount);
    }
    public borrower clone(){
        return new borrower(name, date, amount);
    }

    public boolean equals(borrower a){
        return name.equals(a.getname()) &&
                amount == a.getAmount() &&
                date.equals(a.getDate());
    }
    public String getname(){
        return name;
    }
    public Date getDate() {
        return date;
    }

    public double getAmount(){
        return amount;
    }
}