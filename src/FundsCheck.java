public class FundsCheck {
    private double cashInAccount=1000.00;
    public double getCashInAccount(){
        return cashInAccount;
    }
    public void decreaseCashInacount(double cashWithdrawn){
        cashInAccount-=cashWithdrawn;
    }
    public void increaseCashInaccount(double cashDeposited){
        cashInAccount+=cashDeposited;
    }
    public boolean haveENoughMoney(double cashToWithdraw){
        if(cashToWithdraw>getCashInAccount()){
            System.out.println("Error You dont have money");
            System.out.println("Current Balance is "+getCashInAccount());
            return false;
        }else{
            decreaseCashInacount(cashToWithdraw);
            System.out.println("Withdrawal Complete, Current balance is "+getCashInAccount());
            return true;
        }
    }
    public void makeDeposit(double cashTodeposit){
        increaseCashInaccount(cashTodeposit);
        System.out.println("Deposit Complete Current balance is "+getCashInAccount());

    }
}
