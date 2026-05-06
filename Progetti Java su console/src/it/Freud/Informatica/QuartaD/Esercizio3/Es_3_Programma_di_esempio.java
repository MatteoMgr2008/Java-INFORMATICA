/**
 * 
 */
package it.Freud.Informatica.QuartaD.Esercizio3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import it.Freud.Informatica.QuartaD.Esercizio6.Es_6_Il_costruttore;

/**
 * 
 */
public class Es_3_Programma_di_esempio {

	/**
	 * 
	 */
	public Es_3_Programma_di_esempio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println("Questo è il codice della classe main");
		
		Locale localeJapan=Locale.JAPAN;
		
		Date data_odierna=new Date();
		
		SimpleDateFormat formato_data_1=new SimpleDateFormat();
		
		
		Es_6_Il_costruttore costruttore=new Es_6_Il_costruttore();
		
		System.out.println();
		
		Es_6_Il_costruttore.getFileName("C:/Users/matte/OneDrive - Scuola Paritaria S. Freud SRL/Desktop/FREUD/4°D/QUADERNI E ALTRO/INFORMATICA/JAVA/ESERCIZI IN CLASSE/File txt di prova.txt");
		
		int x=2;
		int y=3;
		int z=x+y;
		Integer k=Integer.valueOf("2");
		Integer q=Integer.parseInt("2");
		
		Integer m=k+q;
		String stringa_prova=String.valueOf(false);
		
		System.setProperty("numero_esercizio_java", "3");
		Integer info_esercizio_java=Integer.getInteger("numero_esercizio_java");	
		System.out.println();
		
		System.out.println("Il contenuto della variabile stringa_prova è il seguente: "+stringa_prova);
		
		String stringa_nome=new String("Matteo");
		String stringa_cognome=new String();
		stringa_cognome.concat("magri").concat("no");
		int lunghezza_stringa_nome=stringa_nome.length();
		System.out.println();
		
		System.out.println("Buongiorno "+stringa_nome+"!");
		System.out.println();
		System.out.println("La dimensione dell'array (matrice) args è la seguente: "+args.length);
		System.out.println();
		
		@SuppressWarnings("rawtypes")
		List lista_esempio1=new Vector();
		List<String> lista_esempio2=new ArrayList();
		
		List lista_esempio3=new Vector();
		ArrayList lista_esempio4=new ArrayList();
		
		lista_esempio1.add("Anna");
		lista_esempio1.add("Paola");
		lista_esempio1.add("Maria");
		lista_esempio1.add(2, "Marco");
		lista_esempio1.add(0, "Matteo");
		
		int[][] array_esempio=new int[2][3];
		
		String nome_persona1="Paola";
		String nome_persona2="Maria";
		
		System.out.println("PRE SWAP: Il nome della persona 1 è "+nome_persona1+", invece il nome della persona 2 è "+nome_persona2);
		Es_6_Il_costruttore.swap_bubble_sort(nome_persona1, nome_persona2);
		System.out.println("POST SWAP: Il nome della persona 1 è "+nome_persona1+", invece il nome della persona 2 è "+nome_persona2);
		
		System.out.println();
		
		System.out.println("PRE SWAP: Il nome della persona 1 è "+(String)lista_esempio1.get(2)+", invece il nome della persona 2 è "+(String)lista_esempio1.get(3));
		Es_6_Il_costruttore.swap_bubble_sort(lista_esempio1, 2, 3);
		System.out.println("POST SWAP: Il nome della persona 1 è "+(String)lista_esempio1.get(2)+", invece il nome della persona 2 è "+(String)lista_esempio1.get(3));
		
		System.out.println();
		
		System.out.println("PRE SWAP: Il nome della persona 1 è "+nome_persona1+", invece il nome della persona 2 è "+nome_persona2);
		Es_6_Il_costruttore.swap_bubble_sort(nome_persona1, nome_persona2);
		System.out.println("POST SWAP: Il nome della persona 1 è "+nome_persona1+", invece il nome della persona 2 è "+nome_persona2);
		
		System.out.println();
		
		Collections.swap(lista_esempio1, 2, 3);
		System.out.println("SWAP: Il nome della persona 1 è "+(String)lista_esempio1.get(2)+" invece il nome della persona 2 è "+(String)lista_esempio1.get(3));
		
		System.out.println();
		
		String stringa12="Zorro";
		String stringa13="Anna";
		String stringa14="Matteo";
		
		float variabile_prova_float=5;
		
		Set set_prova = new //DA TERMINARE!!!

		System.out.println("Comparazione della stringa 12 con la stringa 13 "+stringa12.compareTo(stringa13));
		System.out.println();
		System.out.println("Comparazione della stringa 13 con la stringa 12 "+stringa13.compareTo(stringa12));
		System.out.println();
		
		System.out.println();
		
		Map map_esempio_hashmap=new HashMap();
		Map map_esempio_treemap=new TreeMap();
		Map map_esempio_hashmap2=new HashMap();
		Map map_esempio3=map_esempio_treemap;
		
		Vector vector_esempio=new Vector<>();
		List lista_esempio5=new Vector<>();
		Queue queue_esempio=new PriorityQueue<String>();
		//lista_esempio5.sort(comp); DA RIVEDERE
		Collections.swap(lista_esempio1, 2, 3);
		
		int posizione_elemento_lista=0;
		for(Iterator iteratore=lista_esempio1.iterator(); iteratore.hasNext();){
			String stringa_prova1=(String) iteratore.next();
			System.out.println(posizione_elemento_lista++ + ":" +stringa_prova1);
		}
		
		try {
			map_esempio_treemap.put(new String("a"), "Matteo");
			map_esempio_treemap.put(new String("b"), "Aldo");
			map_esempio_treemap.put(new String("b"), "Giovanni");
			map_esempio_treemap.put(new String("d"), "Giacomo");
			map_esempio_treemap.put(new String("e"), "Nicola");
			map_esempio_treemap.put(new String("f"), "Ferdinando");
			map_esempio_treemap.put(new String("g"), "Igor");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("--- Messaggio (warning): exception generica catchata ---"+e.getMessage());
		}
		
		Set set_esempio_treemap=map_esempio_treemap.keySet();
		
		int size_set_esempio_treemap=set_esempio_treemap.size();
		Object[] array_set_esempio_treemap=set_esempio_treemap.toArray();
		
		for (int i=0; i<size_set_esempio_treemap; i++){
			String stringa_prova2=(String)array_set_esempio_treemap[i];
			Integer integer_esempio=(Integer)array_set_esempio_treemap[i];
			
			System.out.println("Chiave: "+array_set_esempio_treemap[i]);
			System.out.println("Valore: "+map_esempio_treemap.get(array_set_esempio_treemap[i]));
		}
		
		map_esempio_hashmap2;
		
		System.out.println("I valori interni della lista_esempio_1 sono i seguenti:");
		int posizione_valore_lista=0;
		for (Iterator iterator=lista_esempio1.iterator(); iterator.hasNext();) {
			String stringa_ciclo_for=(String)iterator.next();
			System.out.println(posizione_valore_lista++ + ": "+stringa_ciclo_for);
		}
		
		System.out.println();

		try {
			int a=2;
			int b=0;
			double r=a/b;
			System.out.println("a/b = "+r);
		} catch (Exception pippo) {
			// TODO Auto-generated catch block
			System.out.println("--- Messaggio (warning): exception generica catchata ---");
			pippo.printStackTrace();
		}
		
		System.out.println();

		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}

		for(String stringa:args){
			System.out.println(stringa);
		}
		
		System.out.println();

		// The first arguments is at index 0 of the "args" array.
		// String userName = args[0];
		String nome_utente="Matteo";
		String cognome_utente="Magrino";
		System.out.println("Ciao! Mi chiamo Java, piacere di conoscerti "+nome_utente+" "+cognome_utente+". "+"Benvenuto in questo programma!");
	}

}