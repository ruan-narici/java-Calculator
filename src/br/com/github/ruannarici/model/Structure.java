package br.com.github.ruannarici.model;

public class Structure {
	
	private String[][] numbers = {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", "9"}, {"0"}};
	private String[] operators = {"+", "-", "x", "/"};
	private String calc1 = " ";
	private String calc2 = " ";
	private String operator = " ";

	public void showBase() {
		resetLine();
		showTitle();
		showScreen();
		showOperators();
		showNumbers();
	}
	
	private void resetLine() {
		for (int l = 0; l < 50; l++) {
			System.out.println();
		}
	}
	
	private void showTitle() {
		System.out.println("Developed by @RuanNarici");
		System.out.println("Calculator.jar");
	}
	
	private void showScreen() {
		System.out.println(" ___________________________");
		System.out.println("|    ___________________    |");
		System.out.println("|   |                   |   |");
		System.out.printf("|   |       %s %s %s       |   |" + System.lineSeparator(), calc1, operator, calc2);
		System.out.println("|   |                   |   |");
		System.out.println("|    '''''''''''''''''''    |");
	}
	
	private void showOperators() {
		System.out.println("|    __________________     |");
		for (int l = 0; l < 4; l++) {
			if (l == 0) {
				System.out.print("|   ");
			}
			System.out.print("| " + this.operators[l] + " |");
			if (l == 3) {
				System.out.print("    |");
			}
		}
		System.out.println();
		System.out.println("|    ''''''''''''''''''     |");
	}
	
	private void showNumbers() {
		// 1 - 9
		for (int l = 0; l < 3; l++) {
			System.out.println("|    ___________________    |");
			for (int c = 0; c < 3; c++) {
				if (c == 0) {
					System.out.print("|   ");
				} 
				System.out.print("|  " + numbers[l][c] + "  |");
				if (c == 2) {
					System.out.print("   |");
				}
			}
			System.out.println();
			System.out.println("|    '''''''''''''''''''    |");
		}
		// 0
		System.out.println("|           _____           |");
		System.out.println("|          |  " + numbers[3][0] + "  |          |");
		System.out.println("|           '''''           |");
		System.out.println(" '''''''''''''''''''''''''''");
		System.out.println();
	}
	
	public void insertNumber1(Integer number) {
		this.calc1 = number.toString();
	}
	
	public void resetPanel() {
		this.calc1 = " ";
		this.calc2 = " ";
	}
	
	public void insertNumber2(Integer number) {
		this.calc2 = number.toString();
	}
	
	public void inserOperator(String operator) {
		this.operator = operator;
	}
}
