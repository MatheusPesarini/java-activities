import java.util.Scanner; // precisa importar a classe Scanner para poder usar scan nas variaveis de entrada

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Scanner scanner = new Scanner(System.in); // precisa instanciar o objeto do scanner
        int age = scanner.nextInt();
        
        System.out.println("You are " + age + " years old.");
        
        int test = 10;
        test++;
        System.out.println(test);
    }
}