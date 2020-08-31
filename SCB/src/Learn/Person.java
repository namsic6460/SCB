package Learn;

public class Person {
	
	private String name;
	private int money;
	private String RRN;
	
	public Person(String RRN, String name, int money) {
			this.setRRN(RRN);
			this.setName(name);
			this.setMoney(money);
	}
	
	public String getName() {
		return name;
	}
	private void setRRN(String RRN) {
		this.RRN = RRN;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money > 0) {
			this.money = money;
		}
		else
			this.money = 0;
	}
	public String getRRN() {
		return RRN;
	}
	public void addMoney(int money) {
		this.setMoney(this.getMoney() + money);
	}
	@Override
	public String toString() {
		return this.getName() + " - " + this.getMoney();
	}
}
