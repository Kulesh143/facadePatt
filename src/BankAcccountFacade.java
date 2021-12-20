class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcomToBank bankWelcome;

    BankAccountFacade(int newAcctNum, int newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomToBank();

        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }

    public int getSecurityCode() { return securityCode; }


    public void withdrawCash(double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isSecCodeCorrect(getSecurityCode()) &&
                fundChecker.haveENoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }


    public void depositCash(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isSecCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

}