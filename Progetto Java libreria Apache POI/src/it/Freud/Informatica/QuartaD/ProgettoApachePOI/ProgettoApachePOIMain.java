package it.Freud.Informatica.QuartaD.ProgettoApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Matteo Magrino
 * @version 1.0
 * @since 1.0
 *
 * Spiegazione generale riguardante il funzionamento del progetto
 * "Java libreria Apache POI (Poor Obfuscation Implementation)":
 *
 * Per prima cosa vengono letti dei dati da un file CSV, dopodiché vengono
 * inseriti all'interno di un foglio Excel.
 * L'obiettivo finale è inoltre quello di visualizzare un grafico su Excel
 * con i dati acquisiti.
 */

public class ProgettoApachePOIMain {

	/*
	 * Parte riguardante il file di properties
	 */
	protected static final String nome_file_props="Progetto Java libreria Apache POI.properties";
	
	/**
	 * 
	 */
	public static Properties properties=null;
	
	/*
	 * Parte riguardante la lettura del file di properties
	 */
	public static Properties readProperties(){
		properties=new Properties();
		try(FileInputStream file_input_stream=new FileInputStream("Progetto Java libreria Apache POI.properties")){
			properties.load(file_input_stream);
		}
		catch (IOException e) {
			System.err.println("Impossibile caricare il file di properties a causa del seguente errore: "+e.getMessage());
		}
		return properties;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgettoApachePOIMain.readProperties();
		
		String path_file_POI_Excel=properties.getProperty("Path file Excel contenente i dati");
		String path_file_CSV=properties.getProperty("Path file CSV contenente i dati");
		
		/*FileInputStream file_excel;
		FileInputStream file = new FileInputStream(new File(fileLocation));
		Workbook workbook = new XSSFWorkbook(file);/*
		
		/*System.out.println("Benvenuto nel progetto sull'utilizzo della libreria Apache POI in Java");
		List<Integer> lista_esempio=new ArrayList<>();
		lista_esempio.add(3);
		lista_esempio.add(4);
		lista_esempio.add(5);
		ProgettoApachePOIOperator progettoApachePOIOperator=new ProgettoApachePOIOperator();
		progettoApachePOIOperator.setListaNumeri(lista_esempio);
		progettoApachePOIOperator.visualizzaListaNumeri();*/
		
		ProgettoApachePOIOperator POIOperator=new ProgettoApachePOIOperator(path_file_POI_Excel);
		ProgettoApacheCSVOperator CSVOperator=new ProgettoApacheCSVOperator(path_file_CSV);
		
		List dati_file_CSV=CSVOperator.getDatiCSV();
		POIOperator.operate();
	}
}