import java.util.Scanner;

public class negozio {
	
	static Scanner input = new Scanner(System.in);
	static Catalogo catalogo = new Catalogo();
	static Telefono telefono;
	
	public static void main(String[] args) {
		
		boolean loop = true;
		int x=0;
		int code;
		
		while(loop) {
		
			x = menu();
			
			switch(x) {
		
				case 1: 
					inserisciTelefono();
		            break;
		            
				case 2: 
					System.out.println("Inserisci il codice del prodotto da vendere: ");
	                code = input.nextInt();
	                catalogo.vendiTelefono(code);
	                break;
			
				case 3: 
	                System.out.println("Inserisci il codice del prodotto da cercare: ");
	                code = input.nextInt();
	                telefono = catalogo.getTelefono(code);
	                System.out.println(telefono);
	                break;
	            
				case 4:
	                  System.out.println("Inserisci il codice del prodotto di cui modificare la quantità: ");
	                  code = input.nextInt();
	
	                  System.out.println("Inserisci la quantità  nuova: ");
	                  int disp = input.nextInt();
	
	                  catalogo.getTelefono(code).setQty(disp);
	                  System.out.println("Modifica avvenuta con successo!");
	                  break;
	              
	            case 5:
	                System.out.println("Inserisci il codice del prodotto da rimuovere: ");
	                code = input.nextInt();
	                catalogo.removeTelefono(code);
	                break;   
	            
	            case 6:
	                System.out.println("Cellulari disponibili: " + catalogo.getAllQty());
	                break;
	
	            case 7:
	                catalogo.listino();
	                break;
				}
			
			 loop = x!=0 ? true : false;
			}
		input.close();
		System.out.println("Terminazione");
	}
	
	public static int menu() {
		int x;
		
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
        
        return x;
	}
	
	public static void inserisciTelefono() {
		 System.out.print("marca: ");
         String marca = input.next();
         
         System.out.print("modello: ");
         String modello = input.next();
         
         System.out.print("codice: ");
         int codice = input.nextInt();
         input.nextLine();
         
         System.out.print("ram: ");
         int ram = input.nextInt();
         input.nextLine();
         
         System.out.print("memoria: ");
         int memoria = input.nextInt();
         input.nextLine();
         
         System.out.print("disponibilita': ");
         int disponibilita = input.nextInt();
         input.nextLine();
         
         System.out.print("prezzo: ");
         double prezzo = input.nextFloat();
         input.nextLine();
         
         telefono = new Telefono(marca, modello, codice, ram, memoria, disponibilita, prezzo);
         catalogo.addTelefono(telefono);
	}
}