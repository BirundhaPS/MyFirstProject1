package com.hdfc.loans.Homeloans;

public class Home {
	
	int mvarA = 50, mvarB = 12, c;
	
	public void Multiply() {
		c = mvarA * mvarB ;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Home obj = new Home();
		obj.Multiply();

	}

}
