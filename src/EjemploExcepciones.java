import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EjemploExcepciones
{
    public static void main(String[] args) //throws FileNotFoundException
    {
        try {
            File archivo = new File("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.print("Dame el primer número: ");
            int num1 = teclado.nextInt();
            System.out.print("Dame el segundo número: ");
            int num2 = teclado.nextInt();
            System.out.print("La division es: " + num1 / num2);
        }
        catch (ArithmeticException e) {
            System.out.println("Division por cero");
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada incorrecta");
        }
        catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        }
    }
}
