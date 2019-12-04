import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainProgram {

	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GregorianCalendar data = null;
		Cliente cliente = null;
		Agenda agenda = new Agenda();
		int id_c = 8; // -> ID nel costruttore
		int id, x;
		boolean loop=true;
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(0, "Pinko", "Pallino", "Mal di pancia", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(1, "Franco", "Dali", "Depressione", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(2, "Pietro", "Angelilo", "Mal di testa", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(3, "Gianluigi", "Danubbio", "Panico", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(4, "Daniel", "Rozza", "Studio", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(5, "Picasso", "Rozzi", "lesione", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(6, "Michelangelo", "Ignorante", "torcicollo", data);
		agenda.addCliente(cliente);
		
		data = new GregorianCalendar(10, 1, 2019);
		cliente = new Cliente(7, "Salvador", "Arte", "frattura", data);
		agenda.addCliente(cliente);

		while(loop) {
		System.out.println("\\---------------------------------------------------------------------------------------\\");
		System.out.println("1. Aggiungere nuovo cliente");
		System.out.println("2. Elimina cliente");
		System.out.println("3. Visualizza utente cliente");
		System.out.println("4. Visualizza la lista di tutti i clienti");
		System.out.println("0. Per uscire");
		System.out.println("\\---------------------------------------------------------------------------------------\\");
		x = input.nextInt();
		switch(x) {
		
		case 1: 
			System.out.println("Inserisci nome");
			String nome = input.next();
			
			System.out.println("Inserisci cognome");
			String cognome = input.next();
			
			System.out.println("Inserisci tipo di appuntamento");
			String type = input.next();
			
			System.out.println("Inserisci giorno");
			int day = input.nextInt();
			
			System.out.println("Inserisci mese");
			int mouth = input.nextInt();
			
			System.out.println("Inserisci anno");
			int year = input.nextInt();
			
			data = new GregorianCalendar(day, mouth, year);
			cliente = new Cliente(id_c, nome, cognome, type, data);
			agenda.addCliente(cliente);
			id_c++;
			
			System.out.println("Registrazione avvenuta con successo..!");
			
			break;
		case 2:
			System.out.println("Inserisci id: ");
			id = input.nextInt();
			
			cliente = agenda.getCliente(id);
			
			if (cliente != null) {
				agenda.removeCliente(id);
				System.out.println("Il cliente è stato rimosso!");
			}
			
			else {
				System.out.println("Id errato");
			}
			
			break;
		case 3:
			System.out.println("Inserisci id: ");
			id = input.nextInt();
			cliente = agenda.getCliente(id);
			if (cliente != null) {
				System.out.println(agenda.getCliente(id));
			}
			else {
				System.out.println("Il cliente non è stato trovato!");
			}
			break;
			
		case 4: 
			agenda.listino();
			break;
			
		default:
			System.out.println("Arrivederci..!!");
			break;
		}
		
		loop = x!=0 ? true : false;
		
		}
	}
}
