/**
 * 
 */
package it.Freud.Informatica.QuartaD.ProgettoApachePOI;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * 
 */
public class ProgettoApacheCSVOperator extends ProgettoApachePOIOperatorGenerale{
	/**
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	*/
	
	String file_dati_CSV;
	//C:/Users/matte/OneDrive - Scuola Paritaria S. Freud SRL/Desktop/FREUD/4°D/QUADERNI E ALTRO/INFORMATICA/JAVA/ESERCIZI IN CLASSE/ProgettiJavaFreudApachePOI/Dati esempio per il progetto Apache POI.csv";
	
	List<List<Integer>> dati_CSV=new ArrayList<List<List<Integer>>();
	
	public List<List<Integer>> getDatiCSV(){
		return dati_CSV;
	}
	
	public void setDatiCSV(List<List<Integer>> dati_CSV){
		this.dati_CSV=dati_CSV;
	}
	
	public ProgettoApacheCSVOperator(String file_dati_CSV){
		this.file_dati_CSV=file_dati_CSV;
	}
	/**
	 * 
	 */
	public ProgettoApacheCSVOperator() {
		/**
		System.out.println("Questo è il constructor");
		// Prima è necessario che il file CSV venga letto e poi si deve inserire i dati nella List
		 try (
				 Reader reader=Files.newBufferedReader(Paths.get(file_origine_dati));
				 CSVParser csvParser=CSVParser(this., CSVFormat.DEFAULT);
		        ) {
		            for (CSVRecord csvRecord : csvParser) {
		                // Accessing Values by Column Index
		            	List<Integer> riga_dati_CSV=new ArrayList<Integer>();
		                dati_CSV.add(Integer.parseInt(csvRecord.get(0)));
		                dati_CSV.add(Integer.parseInt(csvRecord.get(1)));
		                dati_CSV.add(Integer.parseInt(csvRecord.get(2)));
		                dati_CSV.add(Integer.parseInt(csvRecord.get(3)));
		                dati_CSV.add(Integer.parseInt(csvRecord.get(4)));
		                dati_CSV.add(riga_dati_CSV);

		                System.out.println("Record N°1 - "+csvRecord.getRecordNumber());
		                System.out.println("Dato 2 - "+dati_CSV.get(1));
		            }
		        } catch (IOEx)
		    }
	**/
	public void visualizzaListaNumeri(){
		System.out.println("Visualizza la lista di dati d'esempio");
	}

}
