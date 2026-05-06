package it.Freud.Informatica.QuartaD.Progetto_modulo_3_Java;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Classe Calcolatrice che permette di eseguire operazioni matematiche di base e avanzate.
 * Mantiene uno storico di tutte le operazioni eseguite e permette di visualizzarlo o eliminarlo.
 * 
 * @author Matteo Magrino
 * @version 1.0.0
 * @since 2026
 */
public class Calcolatrice {
	// Attributi della classe
	private float risultato_operazione;
	private Map<Integer, String> storico_operazioni_calcolatrice;
	private int contatore_operazioni;
	private String nome_proprietario_calcolatrice;
	
	// Costruttore della classe
	public Calcolatrice(String nome_calcolatrice){
		this.risultato_operazione=0;
		this.storico_operazioni_calcolatrice=new LinkedHashMap<>();
		this.contatore_operazioni=1;
		this.nome_proprietario_calcolatrice=nome_calcolatrice;
	}
	
	// Metodi della classe
	
	/**
	 * Esegue l'addizione tra due numeri.
	 * 
	 * @param valore_1 Il primo addendo
	 * @param valore_2 Il secondo addendo
	 * @return La somma dei due numeri
	 */
	public float addizione(float valore_1, float valore_2){
		this.risultato_operazione=valore_1+valore_2;
		aggiungiOperazioneStorico("Operazione n° "+contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+" + "+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	
	/**
	 * Esegue la sottrazione tra due numeri.
	 * 
	 * @param valore_1 Il minuendo
	 * @param valore_2 Il sottraendo
	 * @return La differenza tra i due numeri
	 */	
	public float sottrazione(float valore_1, float valore_2){
		this.risultato_operazione=valore_1-valore_2;
		aggiungiOperazioneStorico("Operazione n° "+contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+" - "+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Esegue la moltiplicazione tra due numeri.
	 * 
	 * @param valore_1 Il primo fattore
	 * @param valore_2 Il secondo fattore
	 * @return Il prodotto dei due numeri
	 */
	public float moltiplicazione(float valore_1, float valore_2){
		this.risultato_operazione=valore_1*valore_2;
		aggiungiOperazioneStorico("Operazione n° "+contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+" × "+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Esegue la divisione tra due numeri.
	 * Gestisce automaticamente il caso di divisione per zero.
	 * 
	 * @param valore_1 Il dividendo
	 * @param valore_2 Il divisore
	 * @return Il quoziente della divisione, o Infinity se il divisore è zero
	 */
	public float divisione(float valore_1, float valore_2){
		try{
			this.risultato_operazione=valore_1/valore_2;
			aggiungiOperazioneStorico("Operazione n° "+contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+" ÷ "+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola la potenza di un numero elevato ad un esponente.
	 * 
	 * @param valore_1 La base della potenza
	 * @param valore_2 L'esponente della potenza
	 * @return Il risultato di valore_1 elevato alla valore_2
	 */
	public float potenza(float valore_1, float valore_2){
		this.risultato_operazione=(float) Math.pow(valore_1, valore_2);
		aggiungiOperazioneStorico("Operazione n° "+contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+" ^ "+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola la radice n-esima di un numero.
	 * 
	 * @param valore_1 L'indice della radice (n)
	 * @param valore_2 Il radicando
	 * @return La radice n-esima del radicando
	 */
	public float radice(float valore_1, float valore_2){
		this.risultato_operazione=(float) Math.pow(valore_1, 1/valore_2);
		aggiungiOperazioneStorico("Operazione n° "+ contatore_operazioni+": "+castingRisultatiOperazioni(valore_1)+"√"+castingRisultatiOperazioni(valore_2)+" = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola il logaritmo in base specificata di un numero.
	 * Utilizza la formula del cambio di base: log_a(b) = ln(b) / ln(a)
	 * 
	 * @param valore_1 La base del logaritmo
	 * @param valore_2 L'argomento del logaritmo
	 * @return Il logaritmo in base valore_1 di valore_2
	 */
	public float logaritmo(float valore_1, float valore_2){
		float log_naturale;
		float log_decimale;
		log_naturale=(float) Math.log(valore_1);
		log_decimale=(float) Math.log(valore_2);
		this.risultato_operazione=(float) log_naturale/log_decimale;
		aggiungiOperazioneStorico("Operazione n° "+ contatore_operazioni+": "+"log"+castingRisultatiOperazioni(valore_1)+"("+castingRisultatiOperazioni(valore_2)+") = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola il seno di un angolo espresso in gradi.
	 * 
	 * @param valore_1 L'angolo in gradi
	 * @return Il seno dell'angolo (valore compreso tra -1 e 1)
	 */
	public float seno(float valore_1){
		this.risultato_operazione=(float) Math.sin(convertiGradiInRadianti(valore_1));
		aggiungiOperazioneStorico("Operazione n° "+ contatore_operazioni+": "+"sin("+castingRisultatiOperazioni(valore_1)+") = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola il coseno di un angolo espresso in gradi.
	 * 
	 * @param valore_1 L'angolo in gradi
	 * @return Il coseno dell'angolo (valore compreso tra -1 e 1)
	 */	
	public float coseno(float valore_1){
		this.risultato_operazione=(float) Math.cos(convertiGradiInRadianti(valore_1));
		aggiungiOperazioneStorico("Operazione n° "+ contatore_operazioni+": "+"cos("+castingRisultatiOperazioni(valore_1)+") = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Calcola la tangente di un angolo espresso in gradi.
	 * 
	 * @param valore_1 L'angolo in gradi
	 * @return La tangente dell'angolo
	 */	
	public float tangente(float valore_1){
		this.risultato_operazione=(float) Math.tan(convertiGradiInRadianti(valore_1));
		aggiungiOperazioneStorico("Operazione n° "+ contatore_operazioni+": "+"tan("+castingRisultatiOperazioni(valore_1)+") = "+castingRisultatiOperazioni(this.risultato_operazione));
		return this.risultato_operazione;
	}
	
	/**
	 * Aggiunge un'operazione allo storico della calcolatrice.
	 * Incrementa automaticamente il contatore delle operazioni.
	 * 
	 * @param operazione La stringa contenente la descrizione dell'operazione
	 */	
	public void aggiungiOperazioneStorico(String operazione){
		storico_operazioni_calcolatrice.put(contatore_operazioni, operazione);
		contatore_operazioni++;
	}
	
	/**
	 * Visualizza l'intero storico delle operazioni eseguite nella calcolatrice.
	 * Se lo storico è vuoto, viene mostrato un messaggio appropriato.
	 */
	public void visualizzaStorico() {
		if (storico_operazioni_calcolatrice.isEmpty()){
			System.out.println("Nessuna operazione presente nello storico della calcolatrice di "+nome_proprietario_calcolatrice+"!");
		}
		else {
			System.out.println("Lo storico delle operazioni svolte nella calcolatrice di "+nome_proprietario_calcolatrice+" è il seguente:");
			for (Integer indice_operazione : storico_operazioni_calcolatrice.keySet()){
				System.out.println(storico_operazioni_calcolatrice.get(indice_operazione));
			}
		}
	}
	
	
	/**
	 * Elimina completamente lo storico delle operazioni e reimposta il contatore a 1.
	 * Mostra un messaggio di conferma dell'eliminazione.
	 */	
	public void eliminaStorico() {
		storico_operazioni_calcolatrice.clear();
		contatore_operazioni=1;
		System.out.println("Lo storico della calcolatrice di "+nome_proprietario_calcolatrice+", contenente le operazioni svolte, è stato eliminato (resettato) con successo!");
		System.out.println("Le operazioni che si svolgeranno in questa calcolatrice d'ora in avanti verranno salvate in un nuovo storico!");
	}
	
	/**
	 * Restituisce il nome del proprietario della calcolatrice.
	 * 
	 * @return Il nome del proprietario
	 */
	public String getNomeProprietarioCalcolatrice(){
		return this.nome_proprietario_calcolatrice;
	}
	
	/**
	 * Converte un numero float in stringa, rimuovendo la parte decimale se è zero.
	 * Ad esempio: 5.0 diventa "5", mentre 5.5 rimane "5.5"
	 * 
	 * @param risultato Il numero da convertire
	 * @return La rappresentazione in stringa del numero
	 */
	public String castingRisultatiOperazioni(float risultato){
		if (risultato%1==0){
			return String.valueOf((int)risultato);
		}
		else{
			return String.valueOf(risultato);
		}
	}
	
	/**
	 * Converte un angolo da gradi a radianti.
	 * Utilizza la formula: radianti = (gradi × π) / 180
	 * 
	 * @param numero_gradi L'angolo espresso in gradi
	 * @return L'angolo espresso in radianti
	 */
	private float convertiGradiInRadianti(float numero_gradi) {
		return (float) Math.PI*numero_gradi/180;
	}
	
}