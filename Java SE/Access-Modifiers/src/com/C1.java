package com;

public class C1 {

	void defaltC1Method() {

	}

	public void publicC1Method() {

	}

	protected void protectedC1Method() {

	}

	private void privateC1Method() {
		
		System.out.println("--- Private method");
	}

	public static void test() {

		// -------
		
		C1 c1 = new C1();
		c1.privateC1Method();
	}

	public static void main(String[] args) {

		C2 c2 = new C2();

	}

}
