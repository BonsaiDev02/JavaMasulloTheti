import java.util.Scanner;

public class negozio {
	
static Scanner input = new Scanner(System.in);
static Catalogo catalogo = new Catalogo();
static Telefono telefono;

	public static void main(String[] args) {
		
	boolean loop = true;
	int x=0;
	
	String marca, modello;
	int code, ram, memoria, qty;
	double prezzo;
		
		while(loop) {
		
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("/---------------------------------------------------------\\");
			System.out.println("1. Aggiungi un cellulare");
			System.out.println("2. Vendi un cellulare");
			System.out.println("3. Cerca un cellulare");
			System.out.println("4. Modifica quantità  di un cellulare");
			System.out.println("5. Elimina un cellulare");
			System.out.println("6. Visualizza numero complessivo di cellulari");
			System.out.println("7. Visualizza catalogo");
			System.out.println("0. Per uscire dal programma");
			System.out.print("scelta: ");
			x = input.nextInt();
			System.out.println("/---------------------------------------------------------\\");
			System.out.println();
			System.out.println();
			System.out.println();
			
			switch(x) {
			
				case 1: 					
					System.out.print("marca: ");
					marca = input.next();
					
					System.out.print("modello: ");
					modello = input.next();
					 
					System.out.print("codice: ");
					code = input.nextInt();
					 
					System.out.print("ram: ");
					ram = input.nextInt();
					
					System.out.print("memoria: ");
					memoria = input.nextInt();
				
					System.out.print("disponibilita': ");
					qty = input.nextInt();
					
					System.out.print("prezzo: ");
					prezzo = input.nextFloat();
					
					telefono = new Telefono(marca, modello, code, ram, memoria, qty, prezzo);
					catalogo.addTelefono(telefono);
					break;
					    
				case 2: 
					System.out.println("Inserisci il codice del prodotto da vendere: ");
					code = input.nextInt();
					
					//MANCA CONTROLLO ERRORE DEL CODICE INSERITO
					
					catalogo.vendiTelefono(code);
					break;
				
				case 3: 
					System.out.println("Inserisci il codice del prodotto da cercare: ");
					code = input.nextInt();
					
					//MANCA CONTROLLO ERRORE DEL CODICE INSERITO
					
					telefono = catalogo.getTelefono(code);
					System.out.println(telefono);
					break;
					
				case 4:
					System.out.println("Inserisci il codice del prodotto di cui modificare la quantità: ");
					code = input.nextInt();
					
					//MANCA CONTROLLO ERRORE DEL CODICE INSERITO
					
					System.out.println("Inserisci la quantità  nuova: ");
					qty = input.nextInt();
					
					catalogo.getTelefono(code).setQty(qty);
					break;
					  
				case 5:
					System.out.println("Inserisci il codice del prodotto da rimuovere: ");
					code = input.nextInt();
					
					//MANCA CONTROLLO ERRORE DEL CODICE INSERITO
					
					catalogo.removeTelefono(code);
					break;   
					
				case 6:
					System.out.println("Cellulari disponibili: " + catalogo.getAllQty());
					break;
					
				case 7:
					catalogo.listino();
					break;
					
				default:
					System.err.println("ERRORE, hai inserito un valore innesistete");
			}
			
			loop = x!=0 ? true : false;
		}
		input.close(); // => CHIUSURA OGGETTO SCANNER
		System.out.println("Terminazione");
	}
}