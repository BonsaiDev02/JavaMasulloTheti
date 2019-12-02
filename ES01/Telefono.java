/**
 * La classe Telefono gestisce i dati di un telefono
 * e permette di modificare la quantità dei telefoni
 * @author FABIO
 * @version v1.1
 *
 */
public class Telefono {

	//ATTRIBUTI
	
	protected String marca;
	protected String modello;
	protected int codice;
	protected int ram;
	protected int memoria;
	protected int qty;
	protected double prezzo;
	
	//COSTRUTTORI
	
	public Telefono() {
		marca = "";
		modello = "";
		codice=0;
		ram=0;
		memoria=0;
		qty=0;
		prezzo=0;
	}
	
	public Telefono(Telefono tel) {
		marca = tel.getMarca();
		modello = tel.getModello();
		codice= tel.getCodice();
		ram= tel.getRam();
		memoria= tel.getMemoria();
		qty= tel.getQty();
		prezzo= tel.getPrezzo();
	}
	
	public Telefono(String marca, String modello,
					int codice, int ram, int memoria, int qty,
					double prezzo) {
		
		this.marca = marca;
		this.modello = modello;
		this.codice = codice;
		this.ram = ram;
		this.memoria = memoria;
		this.qty = qty;
		this.prezzo = prezzo;
	}
	
	
	//METODI
	
	/**
	 * Ritorna la marca del telefono
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Inserisci marca del telefono
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/*
	 * Ritorna il modello del telefono
	 */
	public String getModello() {
		return modello;
	}
	
	/**
	 * inserisci il modello del telefono
	 */
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	/**
	 * Ritorna il codice del telefono 
	 */
	public int getCodice() {
		return codice;
	}
	
	/**
	 * Inserisci il codice del telefono 
	 */
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	/**
	 * Ritorna ram del telefono
	 */
	public int getRam() {
		return ram;
	}
	
	/**
	 * Inserisci ram del telefono
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	/**
	 * Ritorna memoria del telefono
	 */
	public int getMemoria() {
		return memoria;
	}
	
	/**
	 * Inserisci memoria del telefono
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	/**
	 * Ritorna quantita di telefoni
	 */
	public int getQty() {
		return qty;
	}
	
	/**
	 * Inserisce quantita' di telefoni
	 */
	public int setQty(int qty) {
		return this.qty = qty;
	}
	
	/**
	 * Aggiungi nuovi telefoni
	 * @param x Quantità da aggiungere
	 * @return Quantità modificata
	 */
	public int addQty(int x) {
		return qty+=x;
	}
	
	/**
	 * Rimuovi telefoni
	 * @param x numero di telefoni da eliminare
	 * @return numero telefoni aggiornato
	 */
	public int subQty(int x) {
		return qty-=x;
	}
	
	/**
	 * Ritorna prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	
	/**
	 * Inserisci prezzo
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	/***
	 * Visualizza tutte le info del telefono (Utilizzabile con System.out.print)
	 */
	@Override
	public String toString() {
		return "\tmarca=" + marca +
				"\tmodello=" + modello +
				"\tcodice=" + codice +
				"\tram=" + ram +
				"\tmemoria=" + memoria + 
				"\tqty=" + qty + 
				"\tprezzo=" + prezzo;
				
	}
	
	
	
}
