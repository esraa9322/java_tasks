
import java.util.Scanner;
public class Calculator_20190093 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
       int  operation ; 
        System.out.println ( "CHOOSE AN OPERATION \n 1.ADD \n 2. SUBTRACT \n  3.MULTIPLY \n 4.DIVIDE ") ;
        // choose a number from 1 to 4 to perform it is corresponding operation 
        operation = input.nextInt();
        int num1 ,  num2 ;
        System.out.println("ENTER THE FIRST NUMBER ");
        num1 = input. nextInt() ; 
        System.out.println("ENTER THE SECOND NUMBER");
        num2= input.nextInt() ; 
        int addition = num1 + num2 ;
        int multiplication = num1* num2 ;
        float division = num1 / num2 ;
        int subtraction = num1 - num2;
        if ( operation ==1)
        {
        	System.out.println("THE RESULT IS  = " + addition) ;
        }
        else if (operation == 2)
        {
            System .out.println("THE RESULT IS = " + subtraction );
        }
        else if (operation ==3)
        {
            System.out.println("THE RESULT IS =" + multiplication);
        }
        else if (operation == 4)
        {
            System.out.println("THE RESULT IS = " + division) ; 
        }
	}

}

