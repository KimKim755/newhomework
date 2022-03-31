public class Atm {
    public static void main(String[] args) {
        Account checkinsAccount = new Account();


        checkinsAccount.setBalance(-1000.00);
        checkinsAccount.setBalance(2000.00);
        checkinsAccount.setBalance(500.00);

        System.out.println(checkinsAccount.getBalance());






    }


}
