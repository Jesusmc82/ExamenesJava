/**
 * Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno
 * de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.
 *
 * @author Jesús Martín Castro
 */
import java.util.Scanner;

public class Ex16jmc3 {
  public static void main(String[] args) {
    String[] nombre = {"Adrian Aguilar", "Manuel Alcántara", "Jorge Alcaráz", "Joaquín Bello",
    "María Margarita Benitez", "Francisco Casasola"};
    int indiceInicial = 0;
    indiceInicial = (int)(Math.random()*6);
    System.out.print("Le ha tocado salir a... " + nombre[indiceInicial]);
  }
}
