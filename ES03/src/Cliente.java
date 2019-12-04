import java.util.GregorianCalendar;

public class Cliente {

	private int id;
	private String nome;
	private String cognome;
	private String type;
	GregorianCalendar data;
	
	public Cliente(int id, String nome, String cognome, String type, GregorianCalendar data) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.type = type;
		this.data = data;
	}
	
	public Cliente(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		cognome = cliente.getCognome();
		type = cliente.getType();
		data = cliente.getData();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", type=" + type + 
				", data=" + data.get(GregorianCalendar.DAY_OF_MONTH) + "/"  + data.get(GregorianCalendar.MONTH) + "/" + data.get(GregorianCalendar.YEAR)
				+ "]";
	}
	
	
	
	
}
