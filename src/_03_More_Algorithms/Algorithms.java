package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	
        return num1 + " x " + num2 + " = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
    public static boolean isCube(int number) {
    	for (int i = 0; i < number; i++) {
			if (i*i*i == number) {
				return true;
			}
		}
		return false;
    	
    }
    public static boolean isSquare(int number) {
    	for (int i = 0; i < number; i++) {
			if (i*i == number) {
				return true;
			}
		}
		return false;
    	
    }
    public static boolean isPrime(int number) {
    	for (int i = 0; i < number; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;
    	
    }
}
