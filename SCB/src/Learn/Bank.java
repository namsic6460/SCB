package Learn;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Bank {
	SimpleDateFormat format;
	Date date;
	
	private final int MAX_ACCOUNT = 10;
	private Person[] accounts;
	private int size;
	ArrayList<String> logs = new ArrayList<>();
	
	public Bank() {
		accounts = new Person[MAX_ACCOUNT];
		logs = new ArrayList<>();
		size = 0;
		
		/*
		 * format 변수를 재선언하지 말고 대입만 해줘야함
		 */
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		
		this.addLog("은행 설립");
		System.out.println("은행이 설립됨");
	}
	
	public void addLog(String log) {
		date = new Date();
		
		log = format.format(date) + " - " + log;
		this.logs.add(log);
	}
	
	public String getLog() {
		String output ="";
		for(String a : this.logs)
			output += a +"\n";
		return output;
	}
	public boolean createAccount(Person account) {
		if(size < 10) {
			this.accounts[size++] = account;
			this.addLog("계좌 추가 성공-" + account.toString());
			
			return true;
		}
		else {
			if(account instanceof VIP) {
				for(int i = MAX_ACCOUNT-1; i>=0; i--) {
					if(!(this.accounts[i] instanceof VIP)) {
						this.addLog("계좌 삭제- " + this.accounts[i].toString());
						this.accounts[i] = account;
						this.addLog("계좌 추가 성공 - " + account.toString());
						
						return true;
					}
				}
				this.addLog("계좌 추가 실패- " + account.toString());
				return false;
			}
			else {
				this.addLog("계좌 추가 실패- " + account.toString());
				return false;
			}
		}
	}
}
