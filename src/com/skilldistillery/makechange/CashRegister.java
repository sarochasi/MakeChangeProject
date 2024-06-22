package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the price: ");
		double price = keyboard.nextDouble();
		System.out.println("Price: " + price);
		
		System.out.print("How much money tendered: ");
		double money = keyboard.nextDouble();
		
		while(money < price) {
			System.out.print("Money is not enough, please provide more: ");
			money += keyboard.nextDouble();
			
		}
		
		if(money == price) {
			System.out.println("Receive exact amount, Thank you");
		}
		else if (money > price){
		float AmountChange = (float) (money - price);
		System.out.println("Change amount: " + AmountChange);
		
		int bill_20 = 0;
		int bill_10 = 0;
		int bill_5 = 0;
		int bill_1 = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		while(AmountChange >= 20) {
			AmountChange -= 20;
			bill_20 ++;
		}
		while(AmountChange >= 10) {
			AmountChange -= 10;
			bill_10 ++;
		}
		while(AmountChange >= 5) {
			AmountChange -= 5;
			bill_5 ++;
		}
		while(AmountChange >= 1) {
			AmountChange -= 1;
			bill_1 ++;
		}
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
		
		System.out.print("Change: ");
		
		if (bill_20 == 1) {
			System.out.print(bill_20 + " twenty dollar bill ");
		}
		
		if (bill_20 > 1) {
			System.out.print(bill_20 + " twenty dollar bills ");
		}
		
		if (bill_10 == 1) {
			System.out.print(bill_10 + " ten dollar bill ");
		}
		
		if (bill_10 > 1) {
			System.out.print(bill_10 + " ten dollar bills ");
		}
		
		if (bill_5 == 1) {
			System.out.print(bill_5 + " five dollar bill ");
		}
		
		if (bill_5 > 1) {
			System.out.print(bill_5 + " five dollar bills ");
		}
		
		if (bill_1 == 1) {
			System.out.print(bill_1 + " one dollar bill ");
		}
		
		if (bill_1 > 1) {
			System.out.print(bill_1 + " one dollar bill ");
		}
		
		if (quarter == 1) {
			System.out.print(quarter + " quarter ");
		}
		
		if (quarter > 1) {
			System.out.print(quarter + " quarters ");
		}
		
		if (dime == 1) {
			System.out.print(dime + " dime ");
		}
		
		if (dime > 1) {
			System.out.print(dime + " dimes ");
		}
		
		if (nickel == 1) {
			System.out.print(nickel + " nickel ");
		}
		
		if (nickel > 1) {
			System.out.print(nickel + " nickels ");
		}
		
		if (penny == 1) {
			System.out.print(penny + " penny ");
		}
		
		if (penny >= 1) {
			System.out.print(penny + " pennies ");
		}
		
		}
		
		keyboard.close();
		

	}
	
}
