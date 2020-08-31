package Learn;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567","ȫ�浿",1000);
		VIP vip = new VIP(person,5);
		
		person.addMoney(-5000);
		
		System.out.println(person.toString());
		System.out.println(vip.toString());

	}

}
