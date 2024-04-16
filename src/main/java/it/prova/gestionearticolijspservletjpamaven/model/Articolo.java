package it.prova.gestionearticolijspservletjpamaven.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "articolo")
public class Articolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "codice")
	private String codice;
	@Column( name = "descrizione")
	private String descrizione;
	@Column( name = "prezzo")
	private float prezzo;
	@Column( name = "data_arrivo")
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
