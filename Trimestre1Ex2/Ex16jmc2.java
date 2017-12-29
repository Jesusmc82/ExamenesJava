/**
 * Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno
 * de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.
 *
 * @author Jesús Martín Castro
 */
import java.util.Scanner;

public class Ex16jmc2 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    int[] nuevoNumero = new int[10];
    int[] aux = new int[10];
    boolean esPrimo = true;
    boolean esCapicuo = false;
    int i;
    int j;
      
    System.out.println("Array generado:");
    for (i = 0; i < 10; i++) {
      array[i] = (int)(Math.random()*101) + 2;
      System.out.print(array[i] + " ");
    }
      
    for (i = 0; i < array.length; i++) {
      esPrimo = true;
      esCapicuo = false;
      aux[i] = array[i];
        
      for (j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) {
          esPrimo = false;
        }
      }
        
      while (array[i] > 0) {
        nuevoNumero[i] = (nuevoNumero[i]*10) + (array[i] % 10);
        array[i] /= 10;
      }
        
      if (nuevoNumero[i] == aux[i]){
        esCapicuo = true;
      }
      
      System.out.println();
      
      if(esPrimo) {
        System.out.print(" - El número " + aux[i] + " es primo y no es capicúa.");
      } else if(esCapicuo) {
        System.out.print(" - El número " + aux[i] + " es capicúa y no es primo.");
      } else if((esPrimo) && (esCapicuo)){ 
        System.out.print(" - El número " + aux[i] + " es primo y es capicúa.");
      } else {
        System.out.print(" - El número " + aux[i] + " no es primo y no es capicúa.");
      }
    }
  }
}
