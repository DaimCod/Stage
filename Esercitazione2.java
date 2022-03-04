import java.util.Arrays;
import java.util.Scanner;

class Esercitazione2{
  static Scanner tastiera = new Scanner(System.in);

  public static void main(String[] args){
    es1();
    System.out.print(es2() + "\n");
    es3();
    es4();
  }

  static void es1(){
    int[] array = new int[20];
    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*101);
    }

    System.out.println("Array originale");
    stampaArray(array);

    System.out.println("Array ordinato");
    Arrays.sort(array);
    stampaArray(array);
  }

  static boolean es2(){
    System.out.println("Data una parola ti diro' se e' palindroma");
    boolean palindroma = true;
    String str = tastiera.next();

    for(int i = 0, j = str.length()-1; i < str.length()/2 && palindroma; i++, j--){
      if(str.charAt(i) != str.charAt(j))
        palindroma = false;
    }
    return palindroma;
  }

  static void es3(){
    int n1 = 0, n2 = 1, n3;
    System.out.println(n1 + " " + n2);
    for(int i = 2; i < 50; i++){
      n3 = n1 + n2;
      System.out.println(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }

  static void es4(){
    System.out.print("Quanto grande si vuole la matrice? righe = ");
    int x = tastiera.nextInt();
    System.out.print(" colonne = ");
    int y = tastiera.nextInt();
    int[][] matrix1 = new int[x][y];

    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        matrix1[i][j] = (int)(Math.random()*100);
      }
    }
    System.out.println("Originale: ");
    stampaMatrice(matrix1);

    int[][] matrix2 = new int[y][x];
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        matrix2[j][i] = matrix1[i][j];
      }
    }
    System.out.println("Trasposta: ");
    stampaMatrice(matrix2);
  }

  static void stampaMatrice(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
        System.out.println();
    }
  }

  static void stampaArray(int[] array){
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.print("\n");
  }
}
