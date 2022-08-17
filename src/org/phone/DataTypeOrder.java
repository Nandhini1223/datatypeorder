package org.phone;

public class DataTypeOrder {

	private void myPhone() {
		System.out.println("My love of life nothing");

	}

	private void myPhone(int pin, String name, long pinCode, float avgNumber, boolean myLove, char pass) {
		System.out.println(pin + "\n" + name + "\n" + pinCode + "\n" + avgNumber + "\n" + myLove + "\n" + pass);

	}

	private void myPhone(long bankNo, boolean myHate, char fail, float phoneRam, String date, int age) {
		System.out.println(bankNo + "\n" + myHate + "\n" + fail + "\n" + phoneRam + "\n" + date + "\n" + age);

	}

	public static void main(String[] args) {

		DataTypeOrder p = new DataTypeOrder();
		p.myPhone(23456l, true, 'P', 1234.234f, "nandhini", 6543);
		p.myPhone(23, "23/07/1997", 900000l, 64.89f, false, 'F');

	}

}
