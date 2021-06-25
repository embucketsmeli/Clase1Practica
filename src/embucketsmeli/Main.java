package embucketsmeli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    ejercicioDos();
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

  public static void ejercicioDos(){
    System.out.println("escribe dos numeros");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    for (int i = 1; i < n; i++){
      Float result = Float.valueOf(m / i);
      System.out.println(String.format("%d / %d = %d", m, i));
    }
  }


}
