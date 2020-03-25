public class BankAccount {
    private String accountNumber="";
    private String ballance="";
    private String customerName="";
    private String phoneNumber="";
    private String email="";

    public BankAccount(String accountNumber, String ballance, String customerName, String phoneNumber, String email) {
        this.accountNumber = accountNumber;
        this.ballance = ballance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public BankAccount() {}

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBallance() {
        return ballance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBallance(String ballance) {
        this.ballance = ballance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void DepositFounds(double found){
        //Ballance2Double, add found to Ballace, convert ballance to string
        setBallance(Double.toString(Double.parseDouble(getBallance())+found));
    }

    public int WhitdrawFounds(double found)
    {
        double tempBallance = Double.parseDouble(getBallance()) - found;

        if ( tempBallance < 0)
        {
            System.out.println("Only "+ Double.parseDouble(getBallance())+" is available on account");
            return -1;
        }

        setBallance( Double.toString(tempBallance));
        return 0;
    }

}
