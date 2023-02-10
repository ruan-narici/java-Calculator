package br.com.github.ruannarici.model;

import java.util.Scanner;

public class Logic extends Structure {
	
	private int number1;
	private int number2;
	private Integer result;
	private String operator;
	private Scanner scan = new Scanner(System.in);
	private String[] allOperators = {"+", "-", "x", "/"};
	
	private String showAsk1() {
		return "What is the first number?";
	}
	
	private String showAsk2() {
		return "What is the operator?";
	}
	
	private String showAsk3() {
		return "What is the second number?";
	}
	
	public void getNumbers() {
		System.out.println(showAsk1());
		this.number1 = scan.nextInt();
		super.insertNumber1(this.number1);
		super.showBase();
		System.out.println(showAsk2());
		this.operator = scan.next();
		while(notIsOneOperator());
		super.inserOperator(this.operator);
		super.showBase();
		System.out.println(showAsk3());
		this.number2 = scan.nextInt();
		super.insertNumber2(this.number2);
		super.showBase();
	}
	
	private boolean verifyOperator(String x) {
		for (String operator : this.allOperators) {
			if (operator.equals(x)) {
				return true;
			} 
		}
		return false;
	}
	
	private boolean notIsOneOperator() {
		while (!verifyOperator(this.operator)) {
			System.out.println("Invalid operator '" + this.operator + "'." );
			System.out.println("Try again.");
			System.out.println(showAsk2());
			this.operator = scan.next();
			return true;
		}
		return false;
	}
	
	public int executeOperation() {
		switch(this.operator) {
		case "+": {
			this.result = this.number1 + this.number2;
			break;
		}
		
		case "-": {
			this.result = this.number1 - this.number2;
			break;
		}
		
		case "x": {
			this.result = this.number1 * this.number2;
			break;
		}
		
		case "/": {
			this.result = this.number1 / this.number2;
			break;
		}
		
		}
		Integer convertResult = result;
		super.inserOperator(convertResult.toString());
		super.resetPanel();
		super.showBase();
		return this.result;
	}
	

}
