package satyam.file;

import java.util.Scanner;

public class RandomJavacode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("enter first input");
            int number1=sc.nextInt();
            System.out.println("enter second input");
            int number2=sc.nextInt();
            if ( number1 == number2 )           
                System.out.printf( "%d == %d\n", number1, number2 );  
            if ( number1 != number2 )          
                System.out.printf( "%d != %d\n", number1, number2 );  
            if ( number1 < number2 )          
                System.out.printf( "%d < %d\n", number1, number2 );  
            if ( number1 > number2 )          
                System.out.printf( "%d > %d\n", number1, number2 );  
            if ( number1 <= number2 )          
                System.out.printf( "%d <= %d\n", number1, number2 );  
            if ( number1 >= number2 )          
                System.out.printf( "%d >= %d\n", number1, number2 );  
	}

}
