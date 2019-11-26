package ListinoCatalogo;

public class Catalogo {
	
	Telefono telefono = new Telefono();
	private int codice;
	private double prezzo;
	private int qty;
	private int temp;
	
	public Catalogo() {
		codice=0;
		prezzo=0;
		qty=0;
		temp=0;
	}
	
	public double getPrezzo() { return prezzo; }
	public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
	public int getQty() { return qty; }
	public void setQty(int qty) { this.qty = qty; }
	public int getCodice() { return codice; }	
	public void setCodice(int codice) { this.codice = codice; }
	
	public String toString() {
		return "\tPrezzo: " + prezzo
			 + "\tQuantità:" + qty
			 + "\tCODICE:" + codice;
	}
	
	public int addQty(int temp) {
		if(temp>0)
			qty+=temp;
		
		else {
			System.out.println("Errore! valore inserito è uguale o minore di 0");
		}
		return qty;
	}
	
	public int subQty(int temp) {
		if(temp>0)
			qty-=temp;
		
		else {
			System.out.println("Errore! valore inserito è uguale o minore di 0");
		}
		
		return qty;
	}

	
	
}
