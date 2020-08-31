package Learn;

public class VIP extends Person{

	private final int MAX_RANK = 10;
	int rank;
	
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		if(rank >= 1) {
			this.rank = rank;
		}
		else if (rank >= MAX_RANK) {
			this.rank = rank;
		}
		else {
			this.rank = 1;
		}
	}

	public VIP (Person person, int rank) {
		return VIP(Person.getRRN(), Person.getName, Person.getMoney,rank);
	}
	public VIP (String RRN, String name, int money, int rank) {
		super(RRN, name, money);
		this.setRank(rank);
	}
	public String toString() {
		return this.getName() + " [ " + this.getRank() + "]" + this.getMoney;
	}
}
