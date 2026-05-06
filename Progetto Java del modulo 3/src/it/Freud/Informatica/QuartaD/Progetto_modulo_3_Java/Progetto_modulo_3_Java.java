package it.Freud.Informatica.QuartaD.Progetto_modulo_3_Java;

import java.util.Scanner;

/**
 * Classe principale del programma Calcolatrice.
 * Gestisce l'interfaccia utente a linea di comando per eseguire operazioni matematiche
 * utilizzando un'istanza della classe Calcolatrice.
 * 
 * <p>Il programma offre un menù interattivo che permette all'utente di:
 * <ul>
 *   <li>Eseguire operazioni aritmetiche di base (addizione, sottrazione, moltiplicazione, divisione)</li>
 *   <li>Eseguire operazioni avanzate (potenza, radice, logaritmo)</li>
 *   <li>Calcolare funzioni trigonometriche (seno, coseno, tangente)</li>
 *   <li>Visualizzare e gestire lo storico delle operazioni</li>
 * </ul>
 * 
 * @author Matteo Magrino
 * @version 1.0.0
 * @since 2026
 */
public class Progetto_modulo_3_Java {
	
	// Costruttore della classe
	public Progetto_modulo_3_Java() {
		// TODO Auto-generated constructor stub
	}
	
	// Funzione main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Scanner input=new Scanner(System.in);
		int scelta_tool_calcolatrice;
		String scelta_nome_calcolatrice;
		float num1, num2;
		
		System.out.println("Benvenuto/a nella calcolatrice di operazioni di base");
		System.out.println("È possibile, se si desidera, personalizzare questo calcolatore di operazioni di base!");
		System.out.println("Infatti, se si desidera, è possibile inserire il nome del proprietario della calcolatrice oppure premere Invio per saltare questo passaggio facoltativo: ");
		scelta_nome_calcolatrice=input.nextLine();
		
		Calcolatrice calcolatrice_operazioni_base;
		
		if(scelta_nome_calcolatrice.isEmpty()){
			calcolatrice_operazioni_base=new Calcolatrice("base");
			System.out.println("Non è stato indicato alcun nome di un proprietario della calcolatrice nel passaggio precedente. Il nome della calcolatrice perciò è quello standard ed è quindi il seguente: \"Calcolatrice di base\"");
		}
		else{
			calcolatrice_operazioni_base=new Calcolatrice(scelta_nome_calcolatrice);
			System.out.println("Quindi, secondo il dato immesso in precedenza, il nome finale della calcolatrice dopo la personalizzazione è il seguente: \"Calcolatrice di "+scelta_nome_calcolatrice+"\"");
		}
		
		System.out.println();
		System.out.println("In questo programma è possibile calcolare i risultati delle seguenti operazioni: addizione, sottrazione, moltiplicazione, divisione e potenza");
		do {
			stampaMenu();
			scelta_tool_calcolatrice=leggiSceltaMenu(input);
			switch(scelta_tool_calcolatrice){
				case 0:
					System.out.println("Uscita e terminazione del programma in corso...");
					break;
				case 1:
					System.out.println("È stato selezionato il tool del calcolo dell'addizione");
	
	                num1=convalidaInput(input,"Inserisci il primo numero: ");
	                num2=convalidaInput(input,"Inserisci il secondo numero: ");
	                float risultato_addizione=calcolatrice_operazioni_base.addizione(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+" + "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_addizione));
	                break;
				case 2:
					System.out.println("È stato selezionato il tool del calcolo della sottrazione");
	                num1=convalidaInput(input,"Inserisci il primo numero: ");
	                num2=convalidaInput(input,"Inserisci il secondo numero: ");
	                float risultato_sottrazione=calcolatrice_operazioni_base.sottrazione(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+" - "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_sottrazione));
	                break;
				case 3:
					System.out.println("È stato selezionato il tool del calcolo della moltiplicazione");
	                num1=convalidaInput(input,"Inserisci il primo numero: ");
	                num2=convalidaInput(input,"Inserisci il secondo numero: ");
	                float risultato_moltiplicazione=calcolatrice_operazioni_base.moltiplicazione(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+" × "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_moltiplicazione));
	                break;
				case 4:
					System.out.println("È stato selezionato il tool del calcolo della divisione");
	                num1=convalidaInput(input,"Inserisci il primo numero: ");
	                num2=convalidaInput(input,"Inserisci il secondo numero: ");
	                float risultato_divisione=calcolatrice_operazioni_base.divisione(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+" ÷ "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_divisione));
	                break;
				case 5:
					System.out.println("È stato selezionato il tool del calcolo della potenza");
	                num1=convalidaInput(input,"Inserisci il numero della base della potenza: ");
	                num2=convalidaInput(input,"Inserisci il numero dell'esponente della potenza: ");
	                float risultato_potenza=calcolatrice_operazioni_base.potenza(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+" ^ "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_potenza));
	                break;
				case 6:
					System.out.println("È stato selezionato il tool del calcolo della radice");
	                num1=convalidaInput(input,"Inserisci il numero dell'indice della radice: ");
	                num2=convalidaInput(input,"Inserisci il numero del radicando della radice: ");
	                float risultato_radice=calcolatrice_operazioni_base.radice(num1, num2);
	                System.out.println("Il risultato dell'operazione "+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+"√"+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+" è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_radice));
					break;
				case 7:
					System.out.println("È stato selezionato il tool del calcolo del logaritmo");
	                num1=convalidaInput(input,"Inserisci il numero della base del logaritmo: ");
	                num2=convalidaInput(input,"Inserisci il numero dell'argomento del logaritmo: ");
	                float risultato_logaritmo=calcolatrice_operazioni_base.logaritmo(num1, num2);
	                System.out.println("Il risultato dell'operazione "+"log"+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+"("+calcolatrice_operazioni_base.castingRisultatiOperazioni(num2)+") è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_logaritmo));
					break;
				case 8:
					System.out.println("È stato selezionato il tool del calcolo del seno");
	                num1=convalidaInput(input,"Inserisci il numero dell'argomento del seno: ");
	                float risultato_seno=calcolatrice_operazioni_base.seno(num1);
	                System.out.println("Il risultato dell'operazione "+"sin("+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+") è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_seno));
					break;				
				case 9:
					System.out.println("È stato selezionato il tool del calcolo del coseno");
	                num1=convalidaInput(input,"Inserisci il numero dell'argomento del coseno: ");
	                float risultato_coseno=calcolatrice_operazioni_base.coseno(num1);
	                System.out.println("Il risultato dell'operazione "+"cos("+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+") è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_coseno));
					break;			
				case 10:
					System.out.println("È stato selezionato il tool del calcolo della tangente");
	                num1=convalidaInput(input,"Inserisci il numero dell'argomento della tangente: ");
	                float risultato_tangente=calcolatrice_operazioni_base.tangente(num1);
	                System.out.println("Il risultato dell'operazione "+"tan("+calcolatrice_operazioni_base.castingRisultatiOperazioni(num1)+") è "+calcolatrice_operazioni_base.castingRisultatiOperazioni(risultato_tangente));
					break;
				case 11:
					calcolatrice_operazioni_base.visualizzaStorico();
					break;
				case 12:
					calcolatrice_operazioni_base.eliminaStorico();
					break;
	            default:
	            	System.out.println("Il tool scelto e quindi selezionato non è esistente o non è valido. Riprovare inserendo un numero esistente associato ad un tool presente nella lista");
			}	
		} while(scelta_tool_calcolatrice!=0);
		
		input.close();
	}
	
	public static void stampaMenu() {
		System.out.println();
		System.out.println("Selezionare uno dei seguenti tool disponibili in questo programma che si desidera usare: ");
		System.out.println("1) Calcolo dell'addizione");
		System.out.println("2) Calcolo della sottrazione");
		System.out.println("3) Calcolo della moltiplicazione");
		System.out.println("4) Calcolo della divisione");
		System.out.println("5) Calcolo della potenza");
		System.out.println("6) Calcolo della radice quadrata");
		System.out.println("7) Calcolo del logaritmo");
		System.out.println("8) Calcolo del seno");
		System.out.println("9) Calcolo del coseno");
		System.out.println("10) Calcolo della tangente");
		System.out.println("11) Visualizza lo storico delle operazioni svolte nella calcolatrice");
		System.out.println("12) Elimina lo storico delle operazioni svolte nella calcolatrice");
		System.out.println("0) Esci e termina (chiudi) il programma");
	}
	
	/**
	 * Legge e valida la scelta dell'utente dal menu principale.
	 * 
	 * <p>Gestisce automaticamente gli errori di input non validi, continuando
	 * a richiedere l'inserimento finché non viene fornito un numero intero valido.
	 * 
	 * @param scanner Oggetto Scanner utilizzato per leggere l'input dell'utente
	 * @return La scelta dell'utente come numero intero (0-12 per scelte valide, 
	 *         qualsiasi altro numero per scelte non valide che verranno gestite dal default dello switch)
	 * @throws NumberFormatException Se l'input non è un numero intero (gestita internamente con un ciclo)
	 */
	public static int leggiSceltaMenu(Scanner scanner) {
		int scelta = -1;
		boolean valido = false;

		while (!valido) {
			try {
				System.out.print("Input inserito: ");
				scelta = Integer.parseInt(scanner.nextLine());
				valido = true;
			} catch (NumberFormatException e) {
				System.out.println("ERRORE: inserisci un numero intero valido!");
			}
		}
		return scelta;
	}
	
	/**
	 * Valida l'input numerico dell'utente per le operazioni matematiche.
	 * 
	 * <p>Questo metodo garantisce che l'utente inserisca sempre un numero valido,
	 * gestendo automaticamente i seguenti casi di errore:
	 * <ul>
	 *   <li>Input non numerico (testo, caratteri speciali)</li>
	 *   <li>Valori NaN (Not a Number)</li>
	 *   <li>Valori infiniti</li>
	 * </ul>
	 * 
	 * <p>In caso di errore, viene mostrato un messaggio e viene richiesto un nuovo input.
	 * Il ciclo continua finché non viene fornito un numero valido.
	 * 
	 * @param scanner Oggetto Scanner utilizzato per leggere l'input dell'utente
	 * @param messaggio Il messaggio da visualizzare all'utente per richiedere l'input
	 * @return Un numero float valido inserito dall'utente
	 * @throws NumberFormatException Se l'input non può essere convertito in float (gestita internamente)
	 */
	public static float convalidaInput(Scanner scanner, String messaggio) {
		float numero = 0;
		boolean valido = false;

		while (!valido) {
			try {
				System.out.print(messaggio);
				numero = Float.parseFloat(scanner.nextLine());

				if (Float.isNaN(numero) || Float.isInfinite(numero)) {
					throw new NumberFormatException();
				}
				valido = true;
			} catch (NumberFormatException e) {
				System.out.println("ERRORE: inserisci un numero valido!");
			}
		}
		return numero;
	}
}