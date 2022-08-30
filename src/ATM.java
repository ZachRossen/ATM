import java.util.HashMap;

public class ATM {

	private HashMap<Integer, Double> bank = new HashMap<Integer, Double>();
	
	public ATM() {
	}
	
	public void openAccount(int id) {
		bank.put(id, 0.0);
	}
	
	public void openAccount(int id, double money) {
		bank.put(id, money);
	}
	
	public void closeAccount(int id) {
		if (bank.get(id)==0)
			bank.remove(id);
	}
	
	public double checkBalance(int id) {
		if (bank.containsKey(id))
			return bank.get(id);
		return 0.0;
	}
	
	public boolean depositMoney(int id, double money) {
		if (bank.containsKey(id)) {
			bank.put(id, bank.get(id)+money);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(int id, double money) {
		if (bank.containsKey(id)) {
			if (bank.get(id)>=money) {
				bank.put(id, bank.get(id)-money);
				return true;
			}
		}
		return false;
	}
}
