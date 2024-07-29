import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x = 3.14;
        double y = -10;
        
        double z = Math.max(x, y);
        double z2 = Math.min(x, y);
        double z3 = Math.floor(x);

        System.out.println("The maximum value is: " + z + " and the minimum value is: " + z2 + " and the floor value is: " + z3);
        
        double x1, y1, z1;

        System.out.println("Enter the first number: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        y1 = scanner.nextDouble();
        
        z1 = Math.sqrt(Math.pow(x1, y1));

        System.out.println("The result is: " + z1);
        
        scanner.close();
    }
}