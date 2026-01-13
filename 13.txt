Q1 > Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
        I/P => NONE
        O/P => Harry's age in 2024 is ___


import java.util.*;
public class Age{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        int currentYear = 2025;
        int BirthYear;
        System.out.print("Enter the birth year");
        BirthYear = in.nextInt();
        int age = currentYear-BirthYear;
        System.out.println("AGE = "+ age);
        
    }
}

Q2 > Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
     I/P => NONE
     O/P => Sam’s average mark in PCM is ___ 
  

  public class average {
     public static void main(String args[])
     {
       //Maths is 94, Physics is 95 and Chemistry is 96 out of 100
        int math = 94 , Physics = 95 , Chemistry = 96;
        double avg   = (math+Physics+Chemistry)/3;
        System.out.println("The PCM average = "+ avg);
     }
    
  }



Q3 >  Create a program to convert the distance of 10.8 kilometers to miles.
      Hint: 1 km = 1.6 miles
      I/P => NONE
    O/P => The distance  ___ km in miles is ___


import java.util.*;
public class mile
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int km ;44
        System.out.println("Enter the length iin km = ");
        km = in.nextInt();
        double mile = km/1.6;
        System.out.println("The distance in mile =" + mile);
    }
}


04 > Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
    Hint => 
    Use a single print statement to display multiline text and variables.
    Profit = selling price - cost price
    Profit Percentage = profit / cost price * 100
    I/P => NONE
    O/P => 


public class prof_losss {
    public static void main(String args[])
    {
        int sp = 191,cp = 129;
        double profit = sp-cp;
        double pp = (profit/cp)*100;
        System.out.printf("the Profit percentage = "+pp);
        
    }
    
}


Q5 > Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining        non-distributed pens.  Hint => 
   Use Modulus Operator (%) to find the reminder.
   Use Division Operator to find the Quantity of pens
   I/P => NONE
   O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___


import java.util.*;
public class pens {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int NP , P;
        System.out.println("Enter the number of pens available = ");
        NP = in.nextInt();
        System.out.println("Enter the number of people available = ");
        P = in.nextInt();
        float each = NP/P;
        System.out.println("Each will get = "+ each);
        
    }
}


Q6 > The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and 
     discounted price the student will pay for the course.
     Hint => 
     Create a variable named fee and assign 125000 to it.
     Create another variable discountPercent and assign 10 to it.
     Compute discount and assign it to the discount variable.
     Compute and print the fee you have to pay by subtracting the discount from the fee.
     O/P => The discount amount is INR ___ and final discounted fee is INR ___


public class CourseFeeDiscount {
    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}



Q7 > Write a Program to compute the volume of Earth in km^3 and miles^3
     Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
     O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.14159;

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}



Q8 > Create a program to convert distance in kilometers to miles.
     Hint => 
     Create a variable km and assign type as double as in double km;
     Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
     Use Scanner Object to take user input for km as in km = input.nextInt();
     Use 1 mile = 1.6 km formulae to calculate miles and show the output
     I/P => km
     O/P => The total miles is ___ mile for the given ___ km



import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
    }
}


Q9 > Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
   Create a variable named fee and take user input for fee.
   Create another variable discountPercent and take user input.
   Compute the discount and assign it to the discount variable.
   Compute and print the fee you have to pay by subtracting the discount from the fee.
   I/P => fee, discountPrecent
   O/P => The discount amount is INR ___ and final discounted fee is INR ___


import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}


Q10 > Write a program that takes your height in centimeters and converts it into feet and inches
      Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
      I/P => height
      O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();

        double inches = heightCm / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);
    }
}



Q11 >> Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);
    }
}


Q12>>> Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("Area of triangle in square cm is " + areaCm +
                " and in square inches is " + areaInches);
    }
}



Q13 >>> Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____



import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}



Q14>>> Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and in miles is " + miles);
    }
}



Q15 >>>> Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___


import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}


Q16 >>>> Create a program to find the maximum number of handshakes among N number of students.
         Hint => 
         Get integer input for numberOfStudents variable.
         Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
         Display the number of possible handshakes.


import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------------------------------


Level 2 Practice Programs 2 :-- 
-------------------------------

Q1 >> Write a program to take 2 numbers and print their quotient and reminder
      Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
      I/P => number1, number2
      O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___


import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
    }
}


Q2>>> Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-



 import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);
    }
}




Q3 >>> Similarly, write the DoubleOpt program by taking double values and doing the same operations.



import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are "
                + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);
    }
}




Q4 >>> Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit



import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius +
                " celsius is " + fahrenheit + " fahrenheit");
    }
}



Q5>>> Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
      Hint => 
      Create a fahrenheit variable and take the user's input
      User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
      I/P => fahrenheit 
      O/P => The ____ fahrenheit is _____ celsius




import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsius + " celsius");
    }
}




Q6 >>>> Create a program to find the total income of a person by taking salary and bonus from user
       Hint => 
       Create a variable named salary and take user input.
       Create another variable bonus and take user input.
       Compute income by adding salary and bonus and print the result
       I/P => salary, bonus
       O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___



import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        double income = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + income);
    }
}





Q7 >>>  Create a program to swap two numbers 
       Hint => 
       Create a variable number1 and take user input.
       Create a variable number2 and take user input.
       Swap number1 and number2  and print the swapped output
       I/P => number1, number2
       O/P => The swapped numbers are  ___ and ___



import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are "
                + number1 + " and " + number2);
    }
}



Q8>>>  Rewrite the Sample Program 2 with user inputs
       Hint => 
       Create variables and take user inputs for name, fromCity, viaCity, toCity
       Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
       Create Variables and take time taken 
       Finally, print the result and try to understand operator precedence.
       I/P => fee, discountPrecent
       O/P => The results of Int Operations are ___, ___, and ___




import java.util.Scanner;

public class JourneyDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double fromToVia = input.nextDouble();
        double viaToFinal = input.nextDouble();
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinal;

        System.out.println("Name: " + name);
        System.out.println("From " + fromCity + " via " + viaCity + " to " + toCity);
        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Time Taken: " + timeTaken);
    }
}





Q9>>> An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km



import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }
}


Q10 >>> Create a program to divide N number of chocolates among M children.
      Hint => 
      Get an integer value from user for the numberOfchocolates and numberOfChildren.
      Find the number of chocolates each child gets and number of remaining chocolates
      Display the results
      I/P => numberOfchocolates, numberOfChildren
      O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___



import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int chocolates = input.nextInt();
        int children = input.nextInt();

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is "
                + eachChild + " and the number of remaining chocolates are "
                + remaining);
    }
}




Q11 >> Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
       Hint => Simple Interest = Principal * Rate * Time / 100
       I/P => principal, rate, time
       O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}



Q12 >> Create a program to convert weight in pounds to kilograms.
       Hint => 1 pound = 2.2 kg
       I/P => weight
       O/P => The weight of the person in pound is ___ and in kg is ___

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pound is "
                + pounds + " and in kg is " + kg);
    }
}




