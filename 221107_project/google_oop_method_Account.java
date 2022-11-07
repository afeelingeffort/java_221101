class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance; // 잔액

	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}

}

public class google_oop_method_Account {

	public static void main(String[] args) {
		Account acc1 = new Account("123-345-5678", "홍길동", 300000);
		Account acc2 = new Account("456-789-1029", "황진이", 250000);

		int amount = acc1.withdraw(50000);

		acc2.deposit(amount);

		System.out.println("예금주: " + acc1.ownerName);
		System.out.println("잔액: " + acc1.balance);

		System.out.println("예금주: " + acc2.ownerName);
		System.out.println("잔액: " + acc2.balance);
	}

}
