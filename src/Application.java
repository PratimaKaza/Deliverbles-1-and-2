import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		/*String firCh = "";
		String secCh = "";*/
		int firstNumber = 0;
		int secondNumber = 0;
		/*int oneSmallNumber1 = 0;
		int oneSmallNumber2 = 0;
		int twoSmallNumber1 = 0;
		int twoSmallNumber2 = 0;*/
		int x = 0;
		int y = 0;
		/*int p = 0;
		int q = 0;
		int r = 0;*/
		/*boolean digitTotal = true;*/
		int digitTotalx = 0;
		int digitTotalp = 0;
		int digitTotalq = 0;
		int digitTotalr = 0;
		
		
		
		System.out.println("Input a number of your choice.");
			firstNumber = scnr.nextInt();
			firstNumber = Math.abs(firstNumber);
		System.out.println("Input another number with the same number of digits.");
			secondNumber = scnr.nextInt();
			secondNumber = Math.abs(secondNumber);
			
		/*firstNumber = 345;
		secondNumber = 789;*/
		String firChoice = Integer.toString(firstNumber);
		String secChoice = Integer.toString(secondNumber);
		/*p = firstNumber;*/
		if (firChoice.length() == secChoice.length()) {
			System.out.println("You have chosen wisely! Your first number is: " + firstNumber + ". Your second number is: " + secondNumber + ".");
			System.out.println("Please wait while we check to see if each corresponding place in your numbers add to the same total.");
			if (firstNumber > 0) {
				if (firstNumber > 10) {
					if (firstNumber > 100) {
						x = firstNumber % 10;                   // x = 5
						firstNumber = firstNumber / 10;         // firstNumber = 34
						y = secondNumber % 10;                  // y = 3
						secondNumber = secondNumber / 10;       // secondNumber = 54
						digitTotalr = x + y;                    // digitTotalr = 8
						digitTotalx = x + y;                    // digitTotalx = 8
						/*System.out.println(digitTotalx); */       // 8
						/*r = q = firstNumber;   */                    // r = 34
					}
					/*System.out.println("you are weird");*/
					x = firstNumber % 10;
					firstNumber = firstNumber / 10;
					y = secondNumber % 10;
					secondNumber = secondNumber / 10;
					digitTotalq = x + y;
					digitTotalx = x + y;
					/*System.out.println(digitTotalx);*/
					/*q = firstNumber;*/
				}
				x = firstNumber % 10;
				firstNumber = firstNumber / 10;
				y = secondNumber % 10;
				secondNumber = secondNumber / 10;
				digitTotalp = x + y;
				digitTotalx = x + y;
				/*System.out.println(digitTotalx);*/
				/*p = firstNumber;*/
			}
			/*digitTotal = digitTotalp.intValue() == digitTotalq.intValue() == digitTotalr.intValue();
			System.out.println(digitTotalp);
			System.out.println(digitTotalq);
			System.out.println(digitTotalr); */
			
			if (digitTotalp == digitTotalq) {
				if (digitTotalq == digitTotalr){					
			
					System.out.println("True");
					System.out.println("Yay! The digits in your numbers add up to the same total.");
				}
			}
			else {
				
				System.out.println("False");
				System.out.println("Sorry! The digits in your numbers do not add up to the same total.");
			}
			/*else {
				System.out.println("False");*/
				
	
			
			/*x = firstNumber % 10;
			System.out.println(x);
			oneSmallNumber1 = firstNumber / 10;
			System.out.println(oneSmallNumber1);
			x = oneSmallNumber1 % 10;
			System.out.println(x);
			twoSmallNumber1 = oneSmallNumber1 / 10;
			System.out.println(twoSmallNumber1);*/
					
		}
	
		else {
			System.out.println("Error: the lengths of your numbers are not the same.");
		}	
		
	}
}
