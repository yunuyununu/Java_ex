package ch09;

public class Sale extends Product {
	private int amount;
	private int money;
	
	public void input(int code, String name, int price, int amount) {
		// 상품클래스 함수
		setCode(code);
		setName(name);
		setPrice(price);
		this.amount = amount;
	}
	
	public void calc() {
		money = getPrice() * amount;
		//      상품
	}
	
	public void print() {
		System.out.println("Code:" + getCode());
		System.out.println("Name:" + getName());
		System.out.println("Price:" + getPrice());
		System.out.println("Amount:" + amount);
		System.out.println("Money:" + money);
	}
	
}
