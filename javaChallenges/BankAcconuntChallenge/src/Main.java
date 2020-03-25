
public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("002341234","0.00","Marek",
                "888888888","mmm@mas.xx");

        myAccount.setBallance("1000000");

        System.out.println(myAccount.getCustomerName());

        myAccount.DepositFounds(1000);

        System.out.println(myAccount.getBallance());

        System.out.println(myAccount.WhitdrawFounds(900000));
        System.out.println(myAccount.getBallance());

        VipCustomer marek = new VipCustomer("Marek","88888888","Marek@Marek.com");

        VipCustomer octavian = new VipCustomer("Octavian","8888");

    }
}
