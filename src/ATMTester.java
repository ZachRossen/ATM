
public class ATMTester {

	public static void main(String[] args) {
		
		ATM bank = new ATM();
		
		bank.openAccount(42, 1099.99);
		bank.closeAccount(42);
		bank.checkBalance(42);
		bank.depositMoney(42, 0.01);
		bank.checkBalance(42);
		bank.withdrawMoney(42, 2000.00);
		bank.checkBalance(42);
		bank.withdrawMoney(42, 100.00);
		bank.checkBalance(42);
	}

}
