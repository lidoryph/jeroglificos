package es.ivanpeiro.jeroglificos;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int[] numberDividers = {1000000, 100000, 10000, 1000, 100, 10, 1};
    static char[] numberCharacters = {'H', 'R', 'D', 'F', 'C', 'G', 'T'};

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usrInput;
		int usrNumber;
        ArrayList<String> jeroglificos = new ArrayList<String>();


		while(sc.hasNextInt()) {
            usrNumber = sc.nextInt();
            
            if(usrNumber == 0) {
                for (int i = 0; i < jeroglificos.size(); i++) {
                    System.out.println(jeroglificos.get(i));    
                }
                break;
            }
				
            jeroglificos.add(transformNumbers(usrNumber));
		}
    }

    static String transformNumbers(int num) {
        int locNum = num;
        int result;

        String output = "";

        for (int i = 0; i < 7; i++) {
            result = locNum / numberDividers[i];

            if(result > 0) {
                for (int j = 0; j < result; j++) {
                    output += numberCharacters[i];
                }
            }

            locNum -= result * numberDividers[i];
        }
        
        return output;
    }

}
