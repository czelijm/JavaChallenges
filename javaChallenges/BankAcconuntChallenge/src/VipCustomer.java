public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;


    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("UNKNKOWN","UNKNKOWN","UNKNKOWN");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"UNKNKOWN");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
