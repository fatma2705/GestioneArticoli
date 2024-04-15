package it.prova.gestionearticolijspservletjpamaven.model;

import java.time.LocalDate;

public class Articolo {
	
	private Long id;
	private String codice;
	private String descrizione;
	private float prezzo;
	private LocalDate dataArrivo;
	
	
	
	public Articolo() {
		
	}



	public Articolo(Long id, String codice, String descrizione, float prezzo, LocalDate dataArrivo) {
		
		this.id = id;
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.dataArrivo = dataArrivo;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public float getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}



	public LocalDate getDataArrivo() {
		return dataArrivo;
	}



	public void setDataArrivo(LocalDate dataArrivo) {
		this.dataArrivo = dataArrivo;
	}



	@Override
	public String toString() {
		return "Articolo [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", dataArrivo=" + dataArrivo + "]";
	}
	
	
	
	
	
	

}
