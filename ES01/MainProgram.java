package ListinoCatalogo;

import java.util.*;


public class MainProgram {
	
	static Scanner input = new Scanner(System.in);
	
		public static void main(String[] args) {
					 
			 Telefono tel[] = new Telefono[100];
			 Catalogo cat[] = new Catalogo[100];
			 String valueS = null;
			 int valueInt = 0;
			 double valueDouble = 0;
			 int max;
			 int x = 0;
			
			System.out.println("Inserisci il numero di dispositivi: ");
		    max = input.nextInt();
		    
		    inserisciDispositivi(tel, cat, max, valueInt, valueDouble, valueS, x);
		    mostraDispositivi(max, tel, cat);
		    operazioniDispositivo(tel, cat, max, valueInt, valueDouble, valueS, x);
		    mostraDispositivi(max, tel, cat);
		}
			
		private static void operazioniDispositivo(Telefono[] tel, Catalogo[] cat, int max, int valueInt,
												  double valueDouble, String valueS, int x) {	
			do {
				System.out.print("Inserisci codice smartphone: ");
				valueInt = input.nextInt();
				
				for(int i=0; i<max; i++) {
					if (valueInt==cat[i].getCodice()) {
							System.out.println("Al momento ci sono: "
							+ cat[i].getQty()
							+ " smartphone disponibili\n\n"
							+ "Premi 1 per aggiungere smartphone\n"
							+ "Premi 2 per rimuovere smartphone"
							+ "\nQualsiasi numero per uscire");
							valueInt = input.nextInt();
						
						if(valueInt == 1) {
							System.out.println("Inserisci quantità di smartphone: ");
							valueInt = input.nextInt();
							cat[i].addQty(valueInt);
						}
						
						else if(valueInt == 2) {
							System.out.println("Inserisci quantità di smartphone: ");
							valueInt = input.nextInt();
							cat[i].subQty(valueInt);
						}
					}
				}
				System.out.println("Inserisci 0 per terminare le operazioni;");
				x = input.nextInt();
			} while(x!=0);
		}
	
		private static void mostraDispositivi(int max, Telefono tel[], Catalogo cat[]) {
			
			System.out.println("\nPerfetto, hai inserito tutti i dispositivi!\n");
		    System.out.println("Ecco i dispositivi che ci sono nel catalogo: ");
		     
		    for(int i=0; i<max; i++) {
		    	System.out.println(tel[i].toString() + cat[i].toString());
		    }
		}
		
		private static void inserisciDispositivi(Telefono[] tel, Catalogo[] cat, int max, int valueInt,
											 double valueDouble, String valueS, int x) {
			
		for(int i = 0; i < max; i++) {
            tel[i] = new Telefono();
            cat[i] = new Catalogo();

            System.out.print("Aggiungi Marca: ");
            valueS = input.next();
            tel[i].setMarca(valueS);

            System.out.print("Aggiungi Modello CPU");
            valueS = input.next();
            tel[i].setCpu(valueS);

            System.out.print("Aggiungi quantità RAM: ");
            valueInt = input.nextInt();
            tel[i].setRam(valueInt);

            System.out.print("Aggiungi Quantità memoria interna: ");
            valueInt = input.nextInt();
            tel[i].setMemory(valueInt);

            System.out.print("Aggiungi ore di autonomia: ");
            valueInt = input.nextInt();
            tel[i].setAutonomia(valueInt);

            System.out.print("Aggiungi Codice del dispositivo: ");
            valueInt = input.nextInt();
            cat[i].setCodice(valueInt);

            System.out.print("Aggiungi prezzo del dispositivo: ");
            valueDouble = input.nextDouble();
            cat[i].setPrezzo(valueDouble);

            System.out.print("Aggiungi quantità: ");
            valueInt = input.nextInt();
            cat[i].setQty(valueInt);
        }	
	}
}