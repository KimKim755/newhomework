public class Account {
    private double balance; // state

    public double getBalance() {
        return balance;

    }//methods

    public void setBalance(double balance) {
        if (balance <= 0.0) ;
        System.out.println("you cannot withdraw this amount");
        this.balance = balance;
    }
    // solve deposit first, use the setBalance as and example
    //Deposit - make sure you cannot deposit a negative balance
    // make sure that your deposited amount works
    // you can check in main by calling the getBalance() method

    public void addFunds(double addedAmount) {
        if (addedAmount > 0)
            balance = balance + addedAmount;

    }


//
//    public double withdraw (double withdrawnAmount) {
//        if (withdrawnAmount > balance)
//            return 0.0;
//        balance = balance - withdrawnAmount;
//
//   }
    }


