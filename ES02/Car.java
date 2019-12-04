
public class Car {

	private String name;
	private boolean status;
	private boolean accelera;
	private boolean frena;
	private double kmh;
	private double km_percorso;
	
	
	//COSTRUTTORE
	public Car(String name, double kmh, double km_percorso) {
		this.name = name;
		status = false;
		accelera = false;
		frena = false;
		this.kmh = kmh;
		this.km_percorso = km_percorso;
	}
	
	//START Metodi attributo name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//END 
	
	
	//START metodi attributo status
	public boolean on() {
		fix();
		kmh+=50;
		fixPercorso();
		return status = true;
	}
	
	public boolean off() {
		fix();
		kmh-=100;
		fixPercorso();
		return status = false;
	}
	
	public boolean isStatus() {
		return status;
	}
	//END
	

	//START metodi attributo accelera
	public boolean onAccelera() {
		fix();
		kmh+=20;
		km_percorso-=kmh;
		fixPercorso();
		return accelera = true;
	}
	
	public boolean offAccelera() {
		fix();
		kmh-=20;
		km_percorso-=kmh;
		fixPercorso();
		return accelera = false;
	}
	
	public boolean isAccelera() {
		return accelera;
	}
	//END
	
	
	//START metodi attributo frena
	public boolean onFrena() {
		kmh-=100;
		fix();
		km_percorso-=kmh;
		fixPercorso();
		return frena = true;
	}
	
	public boolean offFrena() {
		fix();
		kmh+=50;
		km_percorso-=kmh;
		fixPercorso();
		return frena = false;
	}
	
	public boolean isFrena() {
		return frena;
	}
	//END
	
	public String toStringKmh() {
		return "name = " + name + "\tkm/h: " + kmh + "\tPercorso rimanente: " + km_percorso;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", status=" + status + ", accelera=" + accelera + ", frena=" + frena + "]";
	}

	public double getKm_percorso() {
		return km_percorso;
	}

	public double fix() {
		if (kmh < 0)
		kmh = 0;
		return kmh;
	}
	
	public double fixPercorso() {
		if(km_percorso < 0)
			km_percorso = 0;
		return km_percorso;
	}
	
//	public void setAccelera(boolean accelera) {
//		this.accelera = accelera;
//}
//	
	
//	public void setStatus(boolean status) {
//	this.status = status;
//}
	
//	public void setFrena(boolean frena) {
//		this.frena = frena;
//}	
//	
}
