/*
Name: Shiva Rama Krishna
Student Number : A00245380
Program Description : This Program is all about converting to different units
                       with the help of user-inputs.for example : kilograms to pounds vice versa,
											 kilometers to miles Vice versa and centimeters to Inches vice versa. 
*/
import java.io.*;
import java.util.Scanner;
class Convert {
	public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);// Scanner will allow you to take inputs from user.
    System.out.println("Enter a value to convert:");
    Double input = scan.nextDouble();//User input will stored.

    Scanner unit = new Scanner(System.in);// Scanner will allow you to take inputs from user.
    System.out.println("Enter the current unit of measure:");
    String choice = unit.nextLine();//User input is stored in the form of string.
  	conversion(input, choice); // method call
  }

	/*This method takes input from user as input and choice.
	Then using switch statment it calculates the result and prints the result.*/
	public static void conversion(Double  input, String choice){

	// to avoid error in-case user enter upper case, use toLowerCase() method
	switch(choice.toLowerCase()) {
      case "km":
              Double mi = 0.0d;
              mi = input*0.62;
              System.out.println(input + "km is equal to "+ mi +"miles");//Converting kilometers to miles.
              break;
      case "mil":
             Double km = 0.0d;
             km = input*1.61;
             System.out.print(input + "miles is equal to " + km +"km");//Converting miles to kilometers.
             break;
      case "cm":
              Double in = 0.0d;
              in = input*0.39;
              System.out.println(input + "cm is equal to "+ in +"inches");//Converting centimeters to inches.
              break;
       case "in":
              Double cm = 0.0d;
              cm = input*2.54;
              System.out.print(input + "Inches is equal to "+ cm +"cm");//Converting inches to centimeters.
              break;
       case "kg":
              Double lb = 0.0d;
              lb = input*2.2;
              System.out.print(input + "kilograms is equal to "+ lb +"lb");//Converting kilograms to pounds.
              break;
       case "lb":
              Double kg = 0.0d;
              kg = input*0.45;
              System.out.print(input + "pounds is equal to "+ kg +"kg");//Converting pounds to kilograms.
			  break;
        default:
                System.out.println("Wrong choice \n Try again!");//default case.
    }
  }
}
