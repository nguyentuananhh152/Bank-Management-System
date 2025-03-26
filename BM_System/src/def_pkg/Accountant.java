package def_pkg;

import java.util.List;

public class Accountant {

	public String name;

	// Constructor mặc định
	public Accountant() {
		this.name = "";
	}

	// Constructor với tham số tên
	public Accountant(String name) {
		this.name = name;
	}

	// Lấy tên của Accountant
	public String getName() {
		return this.name;
	}

	// Tìm kiếm tài khoản ngân hàng
	Bank_Account searchAccount1(String accountNum, String CNIC) {
		DB_Handler db = new DB_Handler();
		Bank_Account account = db.searchAccount1(accountNum, CNIC);
		db = null;
		System.out.println("Account infoACC: " + account.getType());
		return account;
	}

	// Tìm kiếm khách hàng
	public Client searchClient1(String accountNum, String CNIC) {
		DB_Handler db = new DB_Handler();
		Client client = db.searchClient1(accountNum, CNIC);
		db = null;
		return client;
	}

	// Gửi tiền bằng séc vào tài khoản
	public int chequeDeposit(String accNum, String chequeNum, int amount) {
		DB_Handler db = new DB_Handler();
		return db.chequeDeposit(accNum, chequeNum, amount);
	}

	// Lấy danh sách giao dịch trong một khoảng thời gian
	public List<Transaction_History> getTransactions(String acc_num, String From, String To) {
		DB_Handler db = new DB_Handler();
		List<Transaction_History> list = db.getTransactions(acc_num, From, To);
		return list;
	}

	// end of class
}
