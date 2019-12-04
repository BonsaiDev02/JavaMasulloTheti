import java.util.Scanner;

public class MainProgram {

	static public void main(String[] args) {
	
		int x;
		Car p1 = new Car("Triplo777" , 250, 2500);
		Car p2 = new Car("GangDelBosco", 212, 2500);
		Scanner input = new Scanner(System.in);
		
		System.out.println("\\---------------------------------------------------------------------\\");
		System.out.println("\\------------------PREMI 1 PER INIZIARE A GIOCARE!---------------------\\");
		x = input.nextInt();
		
		if(x!=1)
		System.err.println("Sei uscito dalla partita!");	
		
		else {
		
			while(p2.getKm_percorso() >0 && p1.getKm_percorso() >0) {
			System.out.println("\\--------------------ECCO I DUE PILOTI DI OGGI-----------------------\\");
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println("\\---------------------------------------------------------------------\\");
			
			
			System.out.println("3......2........1...............VIA");
			p1.on();
			p2.on();
			
			System.out.println("\t\tGiro 1");
			System.out.println(p1.toStringKmh());
			System.out.println(p2.toStringKmh());
			
			p1.onAccelera();
			p1.onAccelera();
			p2.onAccelera();
			
			System.out.println("\t\tGiro 2");
			System.out.println(p1.toStringKmh());
			System.out.println(p2.toStringKmh());
			
			p1.offAccelera();
			p1.offAccelera();
			p2.onAccelera();
			p2.onAccelera();
			
			System.out.println("\t\tGiro 3");
			System.out.println(p1.toStringKmh());
			System.out.println(p2.toStringKmh());
			
			p1.onFrena();
			p1.onAccelera();
			p1.onFrena();
			p1.off();
			p1.on();
			p2.onAccelera();
			p2.onFrena();
			
			System.out.println("\t\tGiro 4");
			System.out.println(p1.toStringKmh());
			System.out.println(p2.toStringKmh());
			}
		}
		
		if(p1.getKm_percorso() == 0) {
			System.out.println("Ha vinto questa squadra!");
			System.out.println(p1.toString());
		}
		
		else {
			System.out.println("Ha vinto questa squadra!");
			System.out.println(p1.toString());
		}
		
	}
}