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
		 * format ������ �缱������ ���� ���Ը� �������
		 */
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		
		this.addLog("���� ����");
		System.out.println("������ ������");
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
			this.addLog("���� �߰� ����-" + account.toString());
			
			return true;
		}
		else {
			if(account instanceof VIP) {
				for(int i = MAX_ACCOUNT-1; i>=0; i--) {
					if(!(this.accounts[i] instanceof VIP)) {
						this.addLog("���� ����- " + this.accounts[i].toString());
						this.accounts[i] = account;
						this.addLog("���� �߰� ���� - " + account.toString());
						
						return true;
					}
				}
				this.addLog("���� �߰� ����- " + account.toString());
				return false;
			}
			else {
				this.addLog("���� �߰� ����- " + account.toString());
				return false;
			}
		}
	}
}
