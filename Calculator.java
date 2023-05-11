import java.util.Scanner;

public class Calculator {//Class
 public static Scanner scan = new Scanner(System.in);
   public static void main(String args[]) {//Main
      int calculatorselection;
      do{
      System.out.println("Please choose one of the following options");
      System.out.println("1 for Addition");
      System.out.println("2 for Subtraction");
      System.out.println("3 for Multiplication");
      System.out.println("4 for Division");
      System.out.println("5 to return to the Main Menu");
      System.out.println();
      calculatorselection = scan.nextInt();
                  System.out.println("Enter the Romans: ");

      Converter num1 = new Converter(scan.next());
      System.out.println("Roman " + num1.Roman);
      
      Converter num2 = new Converter(scan.next());
      System.out.println("Roman " + num2.Roman);
      
      
      switch (calculatorselection)
      {
      case 1: System.out.println("+");
      int a=(num1.Decimal / num2.Decimal);
      Converter add = new Converter(a);
             System.out.println(" Addition of " + num1.Roman + " and " + num2.Roman + " is " + add.Roman);
              break;
     
      case 2: System.out.println("-");
      int s=(num1.Decimal - num2.Decimal);
      Converter sub = new Converter(s);
             System.out.println(" Subtraction of " + num1.Roman + " and " + num2.Roman + " is " + sub.Roman);
              break;
      
      case 3: System.out.println("*");
      int m=(num1.Decimal * num2.Decimal);
      Converter multi = new Converter(m);
            System.out.println(" Multiplication of " + num1.Roman + " and " + num2.Roman + " is " + multi.Roman);
              break;
     
      case 4: System.out.println("/");
      int d=(num1.Decimal / num2.Decimal);
      Converter div = new Converter(d);
              System.out.println(" Division of " + num1.Roman + " and " + num2.Roman + " is " + div.Roman);
              break;
      default: System.out.println("Not available, Try again");
               break;
      }

} while (calculatorselection != 4);
System.out.println();
System.out.println("Calculator");
}
}

