import java.util.Scanner;

public class negozio {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Catalogo catalogo = new Catalogo();
		
		boolean loop = true;
		int x=0;
		int code;
		
		while(loop) {
			System.out.println("Dimmi come procerdere. Effettua una scelta.");
            System.out.println("1. Aggiungi un cellulare");
            System.out.println("2. Vendi un cellulare");
            System.out.println("3. Cerca un cellulare");
            System.out.println("4. Modifica quantità  di un cellulare");
            System.out.println("5. Elimina un cellulare");
            System.out.println("6. Visualizza numero complessivo di cellulari");
            System.out.println("7. Visualizza catalogo");
            System.out.println("0. Per uscire dal programma");
            System.out.println("scelta: ");
			
			x = input.nextInt();
			switch(x) {
		
				case 1: 
		            System.out.println("marca: ");
		            String marca = input.next();
		            
		            System.out.println("modello: ");
		            String modello = input.next();
		            
		            System.out.println("codice: ");
		            int codice = input.nextInt();
		            input.nextLine();
		            
		            System.out.println("ram: ");
		            int ram = input.nextInt();
		            input.nextLine();
		            
		            System.out.println("memoria: ");
		            int memoria = input.nextInt();
		            input.nextLine();
		            
		            System.out.println("disponibilita': ");
		            int disponibilita = input.nextInt();
		            input.nextLine();
		            
		            System.out.println("prezzo: ");
		            double prezzo = input.nextFloat();
		            input.nextLine();
		            
		            Telefono tel = new Telefono(marca, modello, codice, ram, memoria, disponibilita, prezzo);
		            catalogo.addTelefono(tel);
		            break;
				
				case 2: 
					System.out.println("Inserisci il codice del prodotto da vendere: ");
	                code = input.nextInt();
	                input.nextLine();
	                catalogo.vendiTelefono(code);
	                break;
			
				case 3: 
	                System.out.println("Inserisci il codice del prodotto da cercare: ");
	                code = input.nextInt();
	                input.nextLine();
	                Telefono tel1 = catalogo.getTelefono(code);
	                System.out.println(tel1);
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
	                input.nextLine();
	                catalogo.removeTelefono(code);
	                break;   
	            
	            case 6:
	                System.out.println("Cellulari disponibili: " + catalogo.getAllDisponibilita());
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
}