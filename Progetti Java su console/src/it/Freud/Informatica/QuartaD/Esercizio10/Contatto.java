package it.Freud.Informatica.QuartaD.Esercizio10;

import java.time.*;

public class Contatto {
	private String nome;
	private String cognome;
	private String prefissoTelefonico;
	private int numeroTelefonico;
	private String email;
	private String indirizzoAbitazione;
	private String indirizzoUfficio;
	private LocalDate dataCompleanno;
	private String prefissoFax;
	private int numeroFax;
	private String società;
	private String note;
	private String promemoria;
	private String etichette;
	private String altriDettagliAggiuntivi;

	public Contatto(String nome, String cognome, String prefissoTelefonico, int numeroTelefonico, String email, String indirizzoAbitazione, String indirizzoUfficio, LocalDate dataCompleanno, String prefissoFax, int numeroFax, String società, String note, String promemoria, String etichette, String altriDettagliAggiuntivi) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.cognome=cognome;
		this.prefissoTelefonico=prefissoTelefonico;
		this.numeroTelefonico=numeroTelefonico;
		this.email=email;
		this.indirizzoAbitazione=indirizzoAbitazione;
		this.indirizzoUfficio=indirizzoUfficio;
		this.dataCompleanno=dataCompleanno;
		this.prefissoFax=prefissoFax;
		this.numeroFax=numeroFax;
		this.società=società;
		this.note=note;
		this.promemoria=promemoria;
		this.etichette=etichette;
		this.altriDettagliAggiuntivi=altriDettagliAggiuntivi;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	public String getPrefissoTelefonico() {
		return this.prefissoTelefonico;
	}
	
	public void setPrefissoTelefonico(String prefissoTelefonico) {
		this.prefissoTelefonico=prefissoTelefonico;
	}
	
	public int getNumeroTelefonico() {
		return this.numeroTelefonico;
	}

	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzoAbitazione() {
		return this.indirizzoAbitazione;
	}

	public void setIndirizzoAbitazione(String indirizzoAbitazione) {
		this.indirizzoAbitazione = indirizzoAbitazione;
	}

	public String getIndirizzoUfficio() {
		return this.indirizzoUfficio;
	}

	public void setIndirizzoUfficio(String indirizzoUfficio) {
		this.indirizzoUfficio = indirizzoUfficio;
	}

	public LocalDate getDataCompleanno() {
		return this.dataCompleanno;
	}

	public void setDataCompleanno(LocalDate dataCompleanno) {
		this.dataCompleanno = dataCompleanno;
	}

	public String getPrefissoFax() {
		return this.prefissoFax;
	}

	public void setPrefissoFax(String prefissoFax) {
		this.prefissoFax = prefissoFax;
	}

	public int getNumeroFax() {
		return this.numeroFax;
	}

	public void setNumeroFax(int numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getSocietà() {
		return this.società;
	}

	public void setSocietà(String società) {
		this.società = società;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPromemoria() {
		return this.promemoria;
	}

	public void setPromemoria(String promemoria) {
		this.promemoria = promemoria;
	}

	public String getEtichette() {
		return this.etichette;
	}

	public void setEtichette(String etichette) {
		this.etichette = etichette;
	}

	public String getAltriDettagliAggiuntivi() {
		return this.altriDettagliAggiuntivi;
	}

	public void setAltriDettagliAggiuntivi(String altriDettagliAggiuntivi) {
		this.altriDettagliAggiuntivi = altriDettagliAggiuntivi;
	}

}