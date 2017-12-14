package Test3;

public class User {
    private String firstname, lastname, email;
    private long phone;
    private String country;

    public String getlastName(){return firstname;}
    public String getFirstName(){return lastname;}
    public String getemail(){return email;}
    public long getphone(){return phone;}
    public String getcountry(){return country;}

    public void setCountry(String country){this.country = country;}
    public void setphone(long phone){this.phone = phone;}
    public void setlastName(String lastName){ this.lastname = lastName;}
    public void setemail(String email){ this.email = email;}
    public void setFirstName(String firstName){ this.firstname = firstname;}

    public User(){}
    public static void main(String[] args){
        User a = new User();
    }

}
