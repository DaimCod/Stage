package esercizio5;
import java.util.Random;

public class TestQuestion {

	public static void main(String[] args) {
		
		int punteggio = 0;
		Random numero = new Random();
		
		Question[] question = new Question[10];
		
		question[0] = new Question("Qual e' la capitale dell'Italia?", "Roma", 1);
		question[1] = new Question("Chi fu l'inventore della lampadina elettrica?", "Edison", 2);
		question[2] = new Question("Cosa significa ISP in informatica?", "Internet Service Provider", 3);
		question[3] = new QuestionYesNo("L'uomo ha mai camminato su marte?", "No", 1);
		question[4] = new QuestionYesNo("Le balene sono dei rettili in quanto vivono nell'acqua fredda, e' vero?", "No", 1);
		question[5] = new QuestionYesNo("Nevica sul Sole", "No", 1);
		question[6] = new NumericQuestion("Quanto fa 3x3", "9", 1);
		question[7] = new NumericQuestion("L'anno dell'atterraggio dell'apollo 11 sulla Luna", "1969", 2);
		question[8] = new NumericQuestion("Qual e' il voto minimo per passare un esame universitario?", "18", 1);
		question[9] = new MultipleQuestion("Come si dice buongiorno in inglese?\n1. Hello\n2. Good evening\n3. Good morning\n4. Good night", "3",2, 4);
				
		System.out.println("Inizio interrogazione!");	
		
		for(int i = 0; i < 3; i++) {
			//per avere un numero random tra 0 e 9
			int num = numero.nextInt(10);
			
			punteggio += question[num].ask();
			
		}
		
		System.out.print("hai ottenuto un punteggio di " + punteggio);
	}

}
