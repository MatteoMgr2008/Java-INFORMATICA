package it.Freud.Informatica.QuartaD.Esercizio8;

import java.util.Scanner;

public class Es_di_compito_per_il_07102025 {
	
	// Costruttore della classe
	public Es_di_compito_per_il_07102025() {
		// TODO Auto-generated constructor stub
	}
	
	// Funzione main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Scanner input=new Scanner(System.in);
		int scelta_tool;
		String scelta_nome_calcolatrice;
		float num1, num2;
		
		System.out.println("Benvenuto nel calcolatore di operazioni di base");
		System.out.println("È possibile scegliere un nome per la calcolatrice di base. Quindi come si desidera chiamare la calcolatrice?");
		scelta_nome_calcolatrice=input.nextLine();
		Calcolatrice calcolatrice_base=new Calcolatrice(scelta_nome_calcolatrice);
		System.out.println("Quindi il nome della calcolatrice finale sarà: calcolatrice di "+scelta_nome_calcolatrice);
		System.out.println();
		System.out.println("In questo programma è possibile calcolare i risultati di: addizioni, sottrazioni, moltiplicazioni, divisioni e potenze");
		do {
			System.out.println("Scegli uno dei seguenti tool: ");
			System.out.println("1) Addizione");
			System.out.println("2) Sottrazione");
			System.out.println("3) Moltiplicazione");
			System.out.println("4) Divisione");
			System.out.println("5) Potenza");
			System.out.println("0) Esci e termina (chiudi) il programma");
			scelta_tool=input.nextInt();
			switch(scelta_tool){
				case 0:
					System.out.println("Uscita e terminazione del programma in corso...");
					break;
				case 1:
					System.out.print("Inserisci il primo numero: ");
	                num1=input.nextFloat();
	                System.out.print("Inserisci il secondo numero: ");
	                num2=input.nextFloat();
	                System.out.println("Il risultato è il seguente "+calcolatrice_base.addizione(num1, num2));
	                break;
				case 2:
					System.out.print("Inserisci il primo numero: ");
	                num1=input.nextFloat();
	                System.out.print("Inserisci il secondo numero: ");
	                num2=input.nextFloat();
	                System.out.println("Il risultato è il seguente "+calcolatrice_base.sottrazione(num1, num2));
	                break;
				case 3:
					System.out.print("Inserisci il primo numero: ");
	                num1=input.nextFloat();
	                System.out.print("Inserisci il secondo numero: ");
	                num2=input.nextFloat();
	                System.out.println("Il risultato è il seguente "+calcolatrice_base.moltiplicazione(num1, num2));
	                break;
				case 4:
					System.out.print("Inserisci il primo numero: ");
	                num1=input.nextFloat();
	                System.out.print("Inserisci il secondo numero: ");
	                num2=input.nextFloat();
	                System.out.println("Il risultato è il seguente "+calcolatrice_base.divisione(num1, num2));
	                break;
				case 5:
					System.out.print("Inserisci il numero della base della potenza: ");
	                num1=input.nextFloat();
	                System.out.print("Inserisci il numero dell'esponente della potenza: ");
	                num2=input.nextFloat();
	                System.out.println("Il risultato è il seguente "+calcolatrice_base.potenza(num1, num2));
	                break;
	            default:
	            	System.out.println("Scelta del tool non valida. Riprovare con un numero esistente associato ad un tool");
			}	
		} while(scelta_tool!=0);
		System.out.println("Selezionare uno dei seguenti tool disponibili in questo programma: ");
	}

}