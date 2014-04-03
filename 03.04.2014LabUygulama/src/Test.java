import java.util.Scanner;


public class Test {

	public static void main(String[] args){

		int[] numbersArray = new int[5];
		Scanner input = new Scanner(System.in);
		int choice = 0;
		for(;;){
			menu();

			System.out.println("Enter your choice: ");
			try{
				choice = input.nextInt();
			}catch (Exception e) {
				System.out.println("You have entered wrong number.");
				main(args);
			}

			switch (choice) {
			case 1:
				NumberArray(numbersArray);

				break;
			case 2:
				System.out.print("Enter the number: ");
				int n = input.nextInt();

				boolean[] primeNumbers = new boolean[n+1];

				PrimeNumbers(n, primeNumbers);
				break;
			case 3:
				Matrix myMatrix = new Matrix(5, 5);

				myMatrix.setElement(3, 4, 100);
				myMatrix.setElement(1, 1, 200);
				myMatrix.print();

				System.out.println();
				Matrix yedekMatris = myMatrix.createCopy(myMatrix);
				yedekMatris.print();

				yedekMatris.add(myMatrix);
				System.out.println();
				yedekMatris.print();
				System.out.println();
				yedekMatris.add(5);
				yedekMatris.print();
				break;

			default:
				System.out.println("You have entered wrong number.");
				main(args);
				break;
			}		
		}
	}

	public static void menu(){
		System.out.println("-------");
		System.out.println("1. Soru");
		System.out.println("2. Soru");
		System.out.println("3. Soru");
		System.out.println("-------");
	}

	public static void PrimeNumbers(int n, boolean[] primeNumbers){

		for (int i = 0; i < n+1; i++) {
			primeNumbers[i] = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0)
					primeNumbers[i] = false;
			}		

		}

		System.out.print("PRIME NUMBERS \n");

		for (int i = 2; i < primeNumbers.length; i++) {
			if(primeNumbers[i] == true)				
				System.out.println(i );

		}
	}




	public static void NumberArray(int[] numbersArray){
		Scanner input = new Scanner(System.in);
		int i = 0;
		while (i < 5) {

			System.out.print("Enter " + (i+1) + ". number: ");
			numbersArray[i] = input.nextInt();

			if(i >0){
				for (int j = 0; j < i; j++) {
					if(numbersArray[j] == numbersArray[i]){
						for(;;){
							System.out.printf("%d. number and %d. number are eqaul.\nPlease enter again: ",i+1,j+1);
							numbersArray[i] = input.nextInt();

							if(numbersArray[i] != numbersArray[j])
								break;
						}
					}					
				}
			}
			i++;
		}

		for (int j = 0; j < 5; j++) {
			System.out.println(numbersArray[j]);
		}
	}

}
