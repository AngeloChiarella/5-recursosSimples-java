package recursos.arrowSwitchCase;

public class ArrowSwitchCase {
	public static void main(String[] args) {
		var myVariable = "nike";

//		NEW
		switch (myVariable) {
			case "adidas" -> System.out.println("Adidas Shoes!");
			case "nike" -> System.out.println("Nike Basketball Shoes!");
			case "converse" -> System.out.println("Converse Shoes!");
			case "new_balance" -> System.out.println("New Balance Skater Shoes!");
		}

//		OLD
		switch (myVariable) {
			case "adidas": {
				System.out.println("Adidas Shoes!");
				break;
			}
			case "nike": {
				System.out.println("Nike Basketball Shoes!");
				break;
			}
			case "converse": {
				System.out.println("Converse Shoes!");
				break;
			}
			case "new_balance": {
				System.out.println("New Balance Skater Shoes!");
				break;
			}
			default:
				break;
		}
	}
}
