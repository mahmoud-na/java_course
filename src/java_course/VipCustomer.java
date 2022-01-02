package java_course;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;
    public VipCustomer(){
        this("Amr Nagy", "amr@email.com",15000);
    }
    public VipCustomer(String name, String email,double creditLimit){
        this.name =name;
        this.creditLimit =creditLimit;
        this.email= email;
    }
    public VipCustomer(String name, String email){
        this(name,email,15000);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
