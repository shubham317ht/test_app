package test_app;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to find factorial :");
        int input = sc.nextInt();
        int fact  = factorial(input);
        System.out.println("The factorial of "+input+" is "+fact);
    }

    private static int factorial(int i) {
        
        if(i == 0){
            return 1;
        } 

        return i*factorial(i-1);
    }
    
}
