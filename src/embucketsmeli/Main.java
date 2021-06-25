package embucketsmeli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    // write your code here
//    ejercicioDos();
//    ejercicioTres();
//    ejercicioCuatro();
    ejercicioCinco();
  }

  /**
   * mostrar los primeros n numeros pares
   */
  public static void ejercicioUno() {
    System.out.println("escribe un numeros");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    //de 1 a n
    for (int i = 1; i < n; i++) {
      //si es par
      if (i % 2 == 0) {
        //imprime
        System.out.println(i);
      }
    }
  }

  /**
   * mostrar los primeros n multiplos de m
   */
  public static void ejercicioDos() {
    System.out.println("escribe dos numeros");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    Float mfloat = (float) m;
    int count = 0;
    //de 2 a m
    for (int i = 2; i < m || count > n; i++) {
      //los casteamos a float para ver decimales
      Float ifloat = (float) i;
      float result = mfloat / ifloat;
      // si no tiene decimales
      if (result % 1 == 0) {
        //imprime el multiplo
        count++;
        System.out.println(String.format("%d es multiplo de %d", m, i));
      }
//      System.out.println(String.format("%d / %d = %f", m, i, result));
    }
  }


  /**
   * mostar si el numero es primo o no
   */
  public static void ejercicioTres() {
    System.out.println("escribe un numero");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    boolean isPrime = isPrime(n);
    if (isPrime) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }
//    boolean isprime = true;
//    int mitad = n / 2;
//    for (int i = 2; i <= mitad; i++) {
//      if (n % i == 0) {
//        System.out.println(String.format("El numero no es primo, es divisible por %d", i));
//        isprime = false;
//        break;
//      }
//    }
//    if (isprime) {
//    }
  }

  /**
   * @param n numero a validar si es primo
   * @return true si es primo de lo contrario false
   */
  public static boolean isPrime(int n) {
    boolean isprime = true;
    int mitad = n / 2;
    for (int i = 2; i <= mitad; i++) {
      if (n % i == 0) {
        isprime = false;
        break;
      }
    }
    return isprime;
  }

  /**
   * Primeros n numeros primos
   */
  public static void ejercicioCuatro() {
    System.out.println("escribe un numero");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }

  }

  /**
   * primeras n numeros naturales con almenos m ocurrencias del digito d
   */
  public static void ejercicioCinco() {
    System.out.println("escribe tres numero");
    Scanner scanner = new Scanner(System.in);
    int cuentosNumeros = scanner.nextInt();
    int alMenos = scanner.nextInt();
    int digitoRepetido = scanner.nextInt();
    int numerosNaturalesEncontrados = 0;
    // regex que agrupa el digitoRepetido a encontrar
    Pattern pattern = Pattern.compile(String.valueOf(String.format("(%d)", digitoRepetido)));
    for (int i = 0; i < Integer.MAX_VALUE && numerosNaturalesEncontrados < cuentosNumeros; i++) {
      Matcher matcher = pattern.matcher(String.valueOf(i));
      int ocurrenciasDelDigito = 0;
      // while que cuenta las veces que se encontro el digitoRepetido a encontrar
      while (matcher.find()) {
        ocurrenciasDelDigito++;
      }
      //si se encontro el digitoRepetido varias veces
      if (ocurrenciasDelDigito >= alMenos) {
        //imprime
        numerosNaturalesEncontrados++;
        System.out.println(i);
      }
    }


  }

}
