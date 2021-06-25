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

  public static void ejercicioUno() {
    System.out.println("escribe un numeros");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  public static void ejercicioDos() {
    System.out.println("escribe dos numeros");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    Float mfloat = (float) m;
    int count = 0;
    for (int i = 2; i < m || count > n; i++) {
      Float ifloat = (float) i;
      float result = mfloat / ifloat;
      if (result % 1 == 0) {
        count++;
        System.out.println(String.format("%d es multiplo de %d", m, i));
      }
//      System.out.println(String.format("%d / %d = %f", m, i, result));
    }
  }


  public static void ejercicioTres() {
    System.out.println("escribe un numero");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    boolean isPrime = isPrime(n);
    if (isPrime){
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

  public static boolean isPrime(int n){
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

  public static void ejercicioCuatro() {
    System.out.println("escribe un numero");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 2; i <= n; i++) {
      boolean isPrime = isPrime(i);
      if (isPrime){
        System.out.println(i);
      }
    }

  }

  public static void ejercicioCinco() {
    System.out.println("escribe tres numero");
    Scanner scanner = new Scanner(System.in);
    int cuentosNumeros = scanner.nextInt();
    int alMenos = scanner.nextInt();
    int digitoRepetido = scanner.nextInt();
    int countFound = 0;
    Pattern pattern = Pattern.compile(String.valueOf(String.format("(%d)", digitoRepetido)));
    for (int i = 0 ; i< Integer.MAX_VALUE && countFound < cuentosNumeros; i++){
      Matcher matcher = pattern.matcher(String.valueOf(i));
      int countFinds = 0;
      while (matcher.find()){
        countFinds++;
      }
      if (countFinds == alMenos){
        countFound++;
        System.out.println(i);
      }
    }


  }

}
