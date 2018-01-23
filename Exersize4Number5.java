import java.util.Scanner;
import java.text.DecimalFormat;

public class Exersize4Number5
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat rounder = new DecimalFormat(".#####");

        double sides, length, area;

        System.out.println("Enter the number of sides of the polygon: ");
        sides = input.nextDouble();
        System.out.println("Enter the length of the sides: ");
        length = input.nextDouble();

        area = (sides * Math.pow(length, 2)) / (4 * Math.tan((Math.PI/sides)));

        System.out.println("The area of a regular polygon with " + sides + " sides each " + length + " long is " + rounder.format(area));

        input.close();




    }
}
