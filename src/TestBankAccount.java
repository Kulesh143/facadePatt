public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade facade=new BankAccountFacade(1234567,1234);
        facade.withdrawCash(900.00);
        facade.withdrawCash(50.00);
        facade.depositCash(200.00);
    }
}
