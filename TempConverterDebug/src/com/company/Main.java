//Code from first Codio task week 7
package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int fahrenheit = 88;

        System.out.println("The temperature in degrees celsius is " + fahrenToCelcius(fahrenheit));

        int celsius=34;

        System.out.println("The temperature in degrees fahrenheit is " + celcToFahren(celsius));
    }

    /*public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total=0;
        System.out.println("Enter a number: ");
        while(in.hasNextDouble())
        {
            total += in.nextDouble();
            count++;
            System.out.println("Enter next number or Q to quit: ");
        }

        double average = total/count;
        System.out.println("Average is: "+ average);
        int F = 212;
        double C = ((double)5/9)*(F-32);
        System.out.println("Celsius: "+C);
    }*/

    public void menu()
    {

    }

    static double fahrenToCelcius(int temp)
    {
        double celcius=(temp - 32)/1.8;
        return celcius;
    }

    static double celcToFahren(int temp)
    {
        double fahren=(temp*1.8) +32;
        return fahren;
    }

    public static void printCharacters(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            System.out.println(word.charAt(i));
        }
    }

    public static void printRoots(double a,double b,double c)
    {
        double root1, root2;
        double determinant = (b * b) - (4 * a) * (c);

        if (determinant < 0)
        {
            System.out.println("\n" + determinant + " is a negative determinant so is not possible.");
        }
        else
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("\n root1 = %.2f and root2 = %.2f", root1 , root2);
        }
    }
}
