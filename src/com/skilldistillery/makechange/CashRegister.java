package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the price: ");
		double price = keyboard.nextDouble();
		System.out.println("Price: " + price);
		
		System.out.println("How much money tendered: ");
		double money = keyboard.nextDouble();
		
		while(money < price) {
			System.out.println("Money is not enough, please provide more: ");
			money += keyboard.nextDouble();
			
		}
		
		if(money == price) {
			System.out.println("Receive exact amount, Thank you");
		}
		
		double AmountChange = money - price;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		while(AmountChange >= 0.25) {
			AmountChange -= 0.25;
			quarter ++;
		}
		while(AmountChange >= 0.1) {
			AmountChange -= 0.1;
			dime++;
		}
		while(AmountChange >= 0.05) {
			AmountChange -= 0.05;
			nickel++;
		}
		while(AmountChange >= 0.01) {
			AmountChange -= 0.01;
			penny++;
		}
		
		
		keyboard.close();
	}
	
}
