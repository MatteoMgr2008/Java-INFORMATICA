/**
 * 
 */
package it.Freud.Informatica.QuartaD.Esercizio6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author Matteo Magrino
 * @apiNote
 * @category Informatica
 * @since 2025
 * @version 1.0.0
 */
public class Es_6_Il_costruttore {

	/**
	 * 
	 */
	
	private String nome_utente="prova";
	
	/**
	 * 
	 * @return
	 */
	public String getNome_utente() {
		Boolean bool_prova=new Boolean(true);
		boolean boolean_primitivo=bool_prova.booleanValue();
		return nome_utente;
	}
	
	/**
	 * 
	 * @param nome_utente
	 */
	public void setNome_utente(String nome_utente) {
		this.nome_utente=nome_utente;
	}
	
	public Es_6_Il_costruttore() {
		// TODO Auto-generated constructor stub
		System.out.println("Testo di prova del costruttore dell'es. 6");
	}
	
	/**
	 * 
	 * @param path_file_txt commento di prova!
	 */
	public static void getFileName(String path_file_txt) {  
		    File myObj = new File(path_file_txt);
		    if (myObj.exists()) {
		      System.out.println("Le informazioni del file txt importato e analizzato sono le seguenti:");
		      System.out.println("File name: " + myObj.getName()); 
		      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
		      System.out.println("Writeable: " + myObj.canWrite()); 
		      System.out.println("Readable: " + myObj.canRead()); 
		      System.out.println("File size in bytes: " + myObj.length());
		      System.out.println();
		      
		      // try-with-resources: FileInputStream will be closed automatically
		      try (FileInputStream input = new FileInputStream(path_file_txt)) {

		        int i;  // variable to store each byte that is read

		        // Read one byte at a time until end of file (-1 means "no more data")
		        while ((i = input.read()) != -1) {
		          // Convert the byte to a character and print it to the console
		          System.out.print("Il carattere con il valore ASCII "+i+" è il seguente: "+(char) i+"\n");
		        }

		      } catch (IOException e) {
		        // If an error happens (e.g. file not found), print an error message
		        System.out.println("Error reading file.");
		      }
		      
		    } else {
		      System.out.println("The file does not exist.");
		    }
		  }  
	
	/**
	 * 
	 * @param nome_persona1
	 * @param nome_persona2
	 */
	public static void swap_bubble_sort(String nome_persona1, String nome_persona2) {
		String variabile_di_appoggio=nome_persona1;
		nome_persona1=nome_persona2;
		nome_persona2=variabile_di_appoggio;
		System.out.println("Il nome della persona 1 è "+nome_persona1+" invece il nome della persona 2 è "+nome_persona2);	
	}
	
	/**
	 * 
	 * @param lista_swap
	 * @param posizione1_lista
	 * @param posizione2_lista
	 * @throws CloneNotSupportedException 
	 */
	
	public static void swap_bubble_sort(List<String> lista_swap, int posizione1_lista, int posizione2_lista) throws CloneNotSupportedException {
		String variabile_di_appoggio=(String)lista_swap.get(posizione1_lista);
		lista_swap.set(posizione1_lista,(String)lista_swap.get(posizione2_lista));
		lista_swap.set(posizione2_lista, variabile_di_appoggio);
		System.out.println("Il nome della persona 1 è "+(String)lista_swap.get(posizione1_lista)+", invece il nome della persona 2 è "+(String)lista_swap.get(posizione2_lista));
		System.out.println("Testo di prova per i metodi di Object"+super.toString());
		System.out.println("Testo di prova per i metodi di Object"+super.hashCode());
		System.out.println("Testo di prova per i metodi di Object"+super.getClass());
		System.out.println("Testo di prova per i metodi di Object"+super.clone());
		System.out.println("Testo di prova per i metodi di Object"+super.getClass());
	}

}