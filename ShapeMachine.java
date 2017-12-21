//Name: Amil Patel
//UFL ID 29332851
//Section: 5994
//Project Number: 2
//Brief description of file contents: The Shape Machine

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShapeMachine 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Shape Machine login\n");
		
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		
		String dateInput = "";
		int introCount = 0;
		do
		{	
			System.out.print("What is today's day? ");
			String day = input.next();
		
			System.out.print("What is today's month? ");
			String month = input.next();
		
			System.out.print("What is today's year? ");
			String year = input.next();
		
			dateInput = (day + "-" + month + "-" + year);
			
			introCount++;
			if(introCount == 3)
			{
				System.out.println("#ERROR 3rd invalid login attempt. Terminating program.");
				System.exit(0);
			}
			if (date.equals(dateInput) == false)
			{
				System.out.println("#ERROR Login attempt #" + introCount + " Invalid input. Please try again.\n");
			}
		
		}while(date.equals(dateInput) == false);
		
		System.out.println("Correct date. Welcome!");
		
		String option = "";
		
		do
		{	
		System.out.println("\n---Welcome to the Shape Machine---");
		System.out.println("Available Options:");
		System.out.println("Circles");
		System.out.println("Rectangles");
		System.out.println("Triangles");
		System.out.println("Exit\n");
		
		option = input.next();
		
		if(option.equals("Circles") == false && option.equals("Rectangles") == false && option.equals("Triangles") == false && option.equals("Exit") == false)
		{
			System.out.print("#ERROR Invalid option. Please try again.");
		}
		
		if(option.equals("Circles"))
		{
			System.out.print("Circles selected. Please enter the radius: ");
			double radius = input.nextDouble();
			
			for( ; radius < 0;  )
			{
				System.out.print("#ERROR Negative input. Please input the radius again: ");
				radius = input.nextDouble();
			}
			
			double circumference = (2 * Math.PI * radius);
			double circleArea = (Math.PI * radius * radius );
			
			String circumferenceString = Double.toString(circumference);
			String circleAreaString = Double.toString(circleArea);
			
			int circumferenceLength = (circumferenceString.length()-1);
			int circleAreaLength = (circleAreaString.length()- 1);
			
			System.out.println("The circumference is: " + circumference);
			System.out.println("The area is: " + circleArea);
			System.out.println("Total number of digits in the circumference is: " + circumferenceLength);
			System.out.println("Total number of digits in the area is: " + circleAreaLength);
		}
		
		if(option.equals("Rectangles"))
		{
			System.out.print("Rectangles selected. Please enter the 2 sides: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			
			for( ; side1 < 0 || side2 < 0; )
			{
				System.out.print("#ERROR Negative input. Please input the 2 sides again: ");
				side1 = input.nextDouble();
				side2 = input.nextDouble();
			}
			
			double rectangleArea = (side1 * side2);
			double rectanglePerimeter = (side1 + side1 + side2 +side2);
			
			String rectangleAreaString = Double.toString(rectangleArea);
			String rectanglePerimeterString = Double.toString(rectanglePerimeter);
			
			int rectangleAreaLength = (rectangleAreaString.length()- 1);
			int rectanglePerimeterLength = (rectanglePerimeterString.length()- 1);
			
			System.out.println("The area is: " + rectangleArea);
			System.out.println("The perimeter is: " + rectanglePerimeter);
			System.out.println("Total number of digits in the area is: " + rectangleAreaLength);
			System.out.println("Total number of digits in the perimeter is: " + rectanglePerimeterLength);
		}
		
		if(option.equals("Triangles"))
		{
			System.out.print("Triangles selected. Please enter the 3 sides: ");
			double triangleSide1 = input.nextDouble();
			double triangleSide2 = input.nextDouble();
			double triangleSide3 = input.nextDouble();
			
			for( ; triangleSide1 < 0 || triangleSide2 < 0 || triangleSide3 < 0; )
			{
				System.out.print("#ERROR Negative input. Please input the 3 sides again: ");
				triangleSide1 = input.nextDouble();
				triangleSide2 = input.nextDouble();
				triangleSide3 = input.nextDouble();
			}
			
			if(triangleSide1 + triangleSide2 < triangleSide3 || triangleSide1 + triangleSide3 < triangleSide2 || triangleSide2 + triangleSide3 < triangleSide1)
			{
				System.out.println("#ERROR Triangle is not valid. Returning to menu.");
				continue;
			}
			
			String triangleType = "";
			if(triangleSide1 == triangleSide2 && triangleSide1 == triangleSide3)
				triangleType = "Equilateral";
			else if(triangleSide1 == triangleSide2 || triangleSide1 == triangleSide3 || triangleSide2 == triangleSide3)
				triangleType = "Isosceles";
			else
				triangleType = "Scalene";
			
			double trianglePerimeter = (triangleSide1 + triangleSide2 + triangleSide3);
			double p = (0.5 * trianglePerimeter);
			double triangleArea = (Math.sqrt(p * (p - triangleSide1) * (p - triangleSide2) * (p - triangleSide3)));
			
			String trianglePerimeterString = Double.toString(trianglePerimeter);
			String triangleAreaString = Double.toString(triangleArea);
			
			int trianglePerimeterLength = (trianglePerimeterString.length()- 1);
			int triangleAreaLength = (triangleAreaString.length()- 1);
			
			System.out.println("The triangle is: " + triangleType );
			System.out.println("The perimeter is: " + trianglePerimeter);
			System.out.println("The area is: " + triangleArea);
			System.out.println("Total number of digits in the perimeter is: " + trianglePerimeterLength);
			System.out.println("Total number of digits in the area is: " + triangleAreaLength);
		}
		
		if(option.equals("Exit"))
		{
			System.out.print("Terminating the program. Have a nice day!");
			System.exit(0);
		}
		
		}while (true);
	}
}
