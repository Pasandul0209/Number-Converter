
import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		L1:while(true){
		System.out.println();
		System.out.println("Enter 1 for Decimal to Binary");
		System.out.println("Enter 2 for Decimal to Octal");
		System.out.println("Enter 3 for Decimal to Hexa");
		System.out.println("Enter 99 to Exit");
		System.out.println();
		System.out.print("Select the converter: ");
		int a1 = input.nextInt();
		System.out.println();
		if (a1 == 1){while(true){
			System.out.println("DecimalToBinary Converter");
			System.out.println();
			System.out.println("Enter 0 to Back");
			System.out.println("Enter 99 to Exit");
			System.out.println();
			System.out.print("Select the action: ");
			int a2 = input.nextInt();
			if (a2 == 0){
				continue L1;
			}else if (a2 == 99){
				return;
			}else{
				System.out.println("Ivalid input detected");
			}
		}}else if (a1 == 2){while(true){
			System.out.println("DecimalToOctal Converter");
			System.out.println();
			System.out.println("Enter 0 to Back");
			System.out.println("Enter 99 to Exit");
			System.out.println();
			System.out.print("Select the action: ");
			int a3 = input.nextInt();
			if (a3 == 0){
				continue L1;
			}else if (a3 == 99){
				return;
			}else{
				System.out.println("Ivalid input detected");
			}
		}}else if (a1 == 3){while(true){
			System.out.println("DecimalToHexa Converter");
			System.out.println();
			System.out.println("Enter 0 to Back");
			System.out.println("Enter 99 to Exit");
			System.out.println();
			System.out.print("Select the action: ");
			int a4 = input.nextInt();
			if (a4 == 0){
				continue L1;
			}else if (a4 == 99){
				return;
			}else{
				System.out.println("Ivalid input detected");
			}
		}}else if (a1 == 99){
			System.out.println("Exit");
			return;
		}else{
			System.out.println("Invalid input detected");
		}
	}
	}
}
			
