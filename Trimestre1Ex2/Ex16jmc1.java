/**
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá llevar el mínimo
 * a la primera posición del array y el máximo a la última, dejando el resto de valores en las posiciones
 * intermedias, en el mismo orden en que aperecieron, llenando los huecos que dejan el máximo y el
 * mínimo. Se puede trabajar sobre un solo array o sobre varios, como el alumno estime oportuno. Si el
 * máximo y/o el mínimo se repite en el array, da igual cuál de ellos se escoja para colocar el primero o el
 * último, siempre que el resultado sea correcto.
 *
 * @author Jesús Martín Castro
 */

import java.util.Scanner;

public class Ex16jmc1 {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
      
    int[] array = new int[20];
    int [] aux = new int[20];
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    int contadorInicio = 0;
    int contadorResultado = 1;
    int contadorFinal = 19;
      
    System.out.println("Array Generado:");
      
    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*100) + 1;
      System.out.print(array[i] + " ");
        
      if (array[i] > numMax) {
        numMax = array[i];
      }
      
      if (array[i] < numMin) {
        numMin = array[i];
      }
    }
       
    System.out.println();
    System.out.println("Array Resultado:");
    
    for(int i = 0; i < 20; i++) {
      if (array[i] == numMin) {
        aux[contadorInicio] = array[i];
        contadorInicio++;
      } else if (array[i] == numMax) {
        aux[contadorFinal] = array[i];
        contadorFinal--;
      } else {
        aux[contadorResultado] = array[i];
        contadorResultado++;
      }
    }
        
    for(int i = 0; i < aux.length; i++){
      if (array[i] != 0) {
      
        System.out.print(aux[i] + " ");
      }
    }
  }    
}
