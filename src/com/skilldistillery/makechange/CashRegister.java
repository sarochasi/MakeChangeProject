package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the price: ");
		double price = keyboard.nextDouble();
		System.out.println("Price: " + price);
		
		keyboard.close();
	}

}
