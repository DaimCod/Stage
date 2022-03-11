import java.util.Scanner;

class Esercitazione1{
  static Scanner tastiera = new Scanner(System.in);

  public static void main(String[] args){
    eserciziArray();
    eserciziStringhe();
    eserciziCicli();
  }
  static void eserciziArray(){
    System.out.println("*************************ESERCIZI ARRAY*************************");
    System.out.println("**********Primo Esercizio**********");
    arrayPrimoEsercizio();
    System.out.println("**********Secondo Esercizio**********");
    secondoEsercizio();
    System.out.println("**********Terzo Esercizio**********");
    terzoEsercizio();
    System.out.println("**********Quarto Esercizio**********");
    quartoEsercizio();
  }

  static void quartoEsercizio(){
    String[] ar1 = {"Casa", "Sole", "Terra", "Stelle", "Computer"};
    String[] ar2 = {"Tavolo", "Luna", "Marte", "Vestiti", "Macchina"};
    boolean oneEqual = false;
    for(int i = 0; i < ar1.length && !oneEqual; i++){
      for(int j = 0; j < ar2.length && !oneEqual; j++){
        if(ar1[i].equalsIgnoreCase(ar2[j]))
          oneEqual = true;
      }
    }
    if(oneEqual == true)
      System.out.println("OK");
    else
        System.out.println("KO");
  }

  static void eserciziStringhe(){
    System.out.println("*************************ESERCIZI STRINGHE*************************");
    System.out.println("**********Primo Esercizio**********");
    strPrimoEsercizio();
    System.out.println("**********Secondo Esercizio**********");
    strSecondoEsercizio();
    System.out.println("**********Terzo Esercizio**********");
    strTerzoEsercizio();
  }

  static void eserciziCicli(){
    System.out.println("*************************ESERCIZI CICLI*************************");
    System.out.println("**********Primo Esercizio**********");
    cicPrimoEsercizio();
    System.out.println("**********Secondo Esercizio**********");
    cicSecondoEsercizio();
    System.out.println("**********Terzo Esercizio**********");
    cicTerzoEsercizio();
  }

  static void cicPrimoEsercizio(){

    System.out.println("Inserire dei numeri separati da spazio");
    String numbers = tastiera.nextLine();
    boolean soloNum = true;
    boolean pari = true;
    boolean positivi = true;
    //controllo che la stringa abbia solo numeri
    for(int i=0; i < numbers.length() && soloNum; i++){
      if(!(numbers.charAt(i) >= '0' && numbers.charAt(i) <= '9' || numbers.charAt(i) == ' ' || numbers.charAt(i) == '-')){
        soloNum = false;
      }
    }
    if(soloNum == false){
      System.out.print("Non si e' inserito solo numeri\n");
      return;
    }

    for(int i=0; i < numbers.length() && pari && positivi; i++){
      if(numbers.charAt(i) >= '0' && numbers.charAt(i) <= '9'){
        //conversione carattere -> intero
        int n = numbers.charAt(i) - '0';
        if(n % 2 != 0)
          pari = false;
        if(i > 0){
          if(numbers.charAt(i-1) == '-'){
            positivi = false;
          }
        }
      }
    }
    if(pari && positivi)
      System.out.print("Tutti positivi e pari");
    else
      System.out.print("NO");
  }

  static void cicSecondoEsercizio(){
    System.out.println("Inserire dei numeri separati da spazio");
    String numbers = tastiera.nextLine();
    boolean soloNum = true;
    int somma = 0, dividendi = 0;

    for(int i=0; i < numbers.length() && soloNum; i++){
      if(!(numbers.charAt(i) >= '0' && numbers.charAt(i) <= '9' || numbers.charAt(i) == ' ' || numbers.charAt(i) == '-')){
        soloNum = false;
      }
    }

    if(soloNum == false){
      System.out.print("Non si e' inserito solo numeri\n");
      return;
    }

    for(int i=0; i < numbers.length(); i++){
      int n = numbers.charAt(i) - '0';
      if(n % 3 == 0){
        somma += n;
        dividendi++;
        System.out.println(somma);
        System.out.println(dividendi);
      }
    }
    System.out.println("La media e' :" + (somma/dividendi));
  }

  static void cicTerzoEsercizio(){
    int counter = 0;
    while(counter < 5){
      System.out.print("Quanti caratteri vuoi inserire?: ");
      int caratteri = tastiera.nextInt();
      System.out.print("\n");

      while(caratteri > 0){
        System.out.print("Inserire un carattere: ");
        String character = tastiera.next();
        System.out.println("inserito: " + character.substring(0, 1));
        caratteri--;
      }
      counter++;
    }

  }

  static void strPrimoEsercizio(){
    System.out.println("Inserire una stringa per vederla scritta al contrario");
    String str = tastiera.nextLine();

    for(int i = str.length()-1; i >= 0; i--){
      System.out.print(str.charAt(i));
    }
    System.out.print("\n");
  }

  static void strSecondoEsercizio(){
    System.out.println("Inserire una stringa per vedere le vocali che contiene");
    String str = tastiera.nextLine();

    for(int i = 0; i < str.length(); i++){
      switch(str.charAt(i)){
        case 'a': case'e': case'i': case'o': case'u': case 'A': case 'E': case 'I': case 'O': case 'U':
          System.out.print(str.charAt(i));
          break;
        default:
          break;
      }
    }
    System.out.println();
  }

  static void strTerzoEsercizio(){
    System.out.println("Inserire una stringa inserendo uno spazio tra una parole ed un'altra");
    String str = tastiera.nextLine();
    String[] split = str.split(" ");
    int counter = 0;

    for(String s : split){
      String[] s2 = s.split(" ");
      for(String ris : s2){
        if(ris.charAt(0) >= 'A' && ris.charAt(0) <= 'Z')
          counter += ris.length();
      }
    }

    System.out.println("La lunghezze e': " + counter);
  }

  static void arrayPrimoEsercizio(){
    int[] numbers = new int[10];
    for(int i = 0; i<numbers.length; i++)
      numbers[i] = i;

    for(int i = 0, j = numbers.length-1; i < numbers.length/2; i++, j--){
      System.out.println(numbers[i]);
      System.out.println(numbers[j]);
    }
  }

  static void secondoEsercizio(){
    int[] numbers = new int[10];
    int pari = 0, dispari = 0;

    for(int i = 0; i < numbers.length; i++)
      numbers[i] = (int)(Math.random()*101);

    /* TEST PER VEDERE A FINE PROGRAMMA LA STAMPA "PARI E DIS UGUALI"
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 4;
    */

    for(int i = 0; i < numbers.length; i++){
      if(i%2 == 0){
        pari += numbers[i];
      } else{
          dispari += numbers[i];
        }
    }

    if(pari == dispari){
      System.out.println("Pari e dispari uguali");
    } else{
      System.out.println("Pari e dispari diversi");
    }
  }

  static void terzoEsercizio(){
    int[] numbers = new int[10];
    boolean trovati = false;
    for(int i = 0; i < numbers.length; i++)
      numbers[i] = (int)(Math.random()*101);

    /* TEST PER VERIFICARE L'UGUAGLIANZA
      int[] numbers = new int[4];
      numbers[0] = 2;
      numbers[1] = 2;
      numbers[2] = 2;
      numbers[3] = 3;
    */

    for(int i = 0; i < numbers.length-1 && !trovati; i++){
      if(numbers[i] == numbers[i+1] && numbers[i] == numbers[i+2]){
        System.out.println("Tre valori consecutivi uguali");
        trovati = true;
      }
    }
    if(trovati == false)
      System.out.println("NO");
  }
}
