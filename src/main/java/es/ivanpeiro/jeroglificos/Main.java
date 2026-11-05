package es.ivanpeiro.jeroglificos;
import java.util.Scanner;

public class Main {

    static int[] numberDividers = {1000000, 100000, 10000, 1000, 100, 10, 1};
    static char[] numberCharacters = {'H', 'R', 'D', 'F', 'C', 'G', 'T'};

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usrInput;
		int usrNumber;

		while(true) {
				System.out.print("Input a number: ");
				usrInput = sc.nextLine();

                if(usrInput.charAt(0) == 'e') break;
		
				try {
						usrNumber = Integer.parseInt(usrInput);
				} catch (NumberFormatException e) {
						System.out.println("Please input a valid number");
						usrNumber = 0;
						continue;
				}
				
                printNumbers(usrNumber);
		}
    }

    static void printNumbers(int num) {
        int locNum = num;
        int result;

        for (int i = 0; i < 7; i++) {
            result = locNum / numberDividers[i];

            if(result > 0) {
                for (int j = 0; j < result; j++) {
                   System.out.print(numberCharacters[i]); 
                }
            }

            locNum -= result * numberDividers[i];
        }
        
        System.out.println();
    }

}
