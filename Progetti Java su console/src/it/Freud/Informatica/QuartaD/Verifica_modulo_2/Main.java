package it.Freud.Informatica.QuartaD.Verifica_modulo_2;

/**
 * @author Matteo Magrino
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Es. 1 della verifica
public class Main {

	/**
	 * @author Matteo Magrino
	 * @version 1.0
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author Matteo Magrino
	 * @version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		// Es. 2 della verifica
		ArrayList<String> lll = new ArrayList<>();
		lll.add("Rosso");
		lll.add("Nero");
		lll.add("Verde");
		lll.add("Viola");
		lll.add("Grigio");
		lll.add("Blu");
		lll.add("Azzuro");
		for (Iterator iterator = lll.iterator(); iterator.hasNext();) {
			System.out.println();
		}
		System.out.println("La lista dei colori è la seguente:"+lll);
		// Es. 3 della verifica
		lll.remove(6);
		lll.remove("Viola");
		lll.remove("Grigio");
		// Es. 4 della verifica
		lll.add("")
	}
}
