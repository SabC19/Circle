package circle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author [Santiago]
 */
public class Mainmain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double radius = 0;
        boolean isValidInput = false;

        System.out.println("--- Circle Calculator ---");

        while (!isValidInput) {
            try {
                System.out.print("Ingresa la coordenada X: ");
                x = scanner.nextDouble();

                System.out.print("Ingresa la coordenada Y: ");
                y = scanner.nextDouble();

                System.out.print("Ingrese el radio ");
                radius = scanner.nextDouble();

                if (radius < 0) {
                    System.out.println("Error: El radio no puede ser negativo.\n");
                    continue; 
                }
                
                isValidInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese valores numericos.\n");
                scanner.nextLine();
            }
        }

        Circle myCircle = new Circle(x, y, radius);

        System.out.println("\n--- Results ---");
        System.out.printf("Diametro: %.2f\n", myCircle.calculateDiameter());
        System.out.printf("Circumference: %.2f\n", myCircle.calculateCircumference());
        System.out.printf("Area: %.2f\n", myCircle.calculateArea());

        scanner.close();
    }
}