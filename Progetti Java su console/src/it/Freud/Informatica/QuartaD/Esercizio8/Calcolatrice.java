package it.Freud.Informatica.QuartaD.Esercizio8;

public class Calcolatrice {
	// Attributi della classe
	private float risultato;
	
	// Costruttore della classe
	public Calcolatrice(String nome_calcolatrice) {
		// TODO Auto-generated constructor stub
		this.risultato=0;
	}
	
	// Metodi della classe
	public float addizione(float valore_1, float valore_2) {
		return valore_1+valore_2;
	}
	public float sottrazione(float valore_1, float valore_2){
		return valore_1-valore_2;
	}
	public float moltiplicazione(float valore_1, float valore_2){
		return valore_1*valore_2;
	}
	public float divisione(float valore_1, float valore_2){
		float calcolo_divisione=0;
		try{
			calcolo_divisione=valore_1/valore_2;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return calcolo_divisione;
	}
	public float potenza(float valore_1, float valore_2){
		return (float) Math.pow(valore_1, valore_2);
	}
	// radice quadrata
	// logaritmo
}