package Learn;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("123456-1234567","홍길동",1000);
		VIP vip = new VIP(person,5);
		person.addMoney(-5000);
		System.out.println(person.toString());
		System.out.println(vip.toString());
		
		/*
		 * Bank에서 작성한 코드를 테스트할 수 있는 구문을 만들고 테스트해보기!
		 */
	}

}
