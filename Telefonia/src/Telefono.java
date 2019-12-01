
public class Telefono {

	protected String marca;
	protected String modello;
	protected int codice;
	protected int ram;
	protected int memoria;
	protected int qty;
	protected double prezzo;
	
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
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public int getQty() {
		return qty;
	}
	
	public int setQty(int qty) {
		return this.qty = qty;
	}
	
	public int addQty(int x) {
		return qty+=x;
	}
	
	public int subQty(int x) {
		return qty-=x;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "marca=" + marca +
				", modello=" + modello +
				", codice=" + codice +
				", ram=" + ram +
				", memoria=" + memoria + 
				", qty=" + qty + 
				", prezzo=" + prezzo;
				
	}
	
	
	
}
