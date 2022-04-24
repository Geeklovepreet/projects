import java.util.Scanner;
 class Main {
     public static void main (String[] args){
         System.out.println("***********Welcome to Celsius to Fahrenheit Converter ******");
         System.out.println("Please Enter celsius value");
         Scanner input = new Scanner(System.in);
         int celsius = input.nextInt();
         int fahrenheit = celsius * 9/5 + 32;
         System.out.println("The value in fahrenheit = :" + fahrenheit);



     }

 }