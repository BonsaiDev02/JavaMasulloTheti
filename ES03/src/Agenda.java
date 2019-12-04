
public class Agenda {

	private Cliente[] cliente;
	private int nClienti;
	
	public Agenda() {
		cliente = new Cliente[100];
		nClienti=0;
	}
	
	public void addCliente(Cliente cliente) {
		this.cliente[nClienti] = new Cliente(cliente);
		nClienti++;
	}
	
	public void removeCliente(int id) {
		Cliente x;
		x= getCliente(id);
		if(x!=null) {
			int i = getIndexCliente(x);
			for(int j = i + 1; j < this.nClienti; j++) {
				cliente[j].setId(cliente[j].getId() - 1);
				cliente[j-1] = cliente[j];
			}
		nClienti--;
		}
	}
	
	public Cliente getCliente(int id) {
		Cliente x = null;
		for(int i = 0; i < this.nClienti; i++) {
			if(id == this.cliente[i].getId()) {
				x = cliente[i];
				i = 101;
			}
		}
		return x;
	}
	
	private int getIndexCliente(Cliente cliente) {
		int i;
		for(i = 0; i < this.nClienti; i++) {
			if(cliente.getId() == this.cliente[i].getId()) {
				return i;
			}
		}
		return 0;
	}
	
	public void listino() {
		for(int i=0; i<nClienti; i++) {
			System.out.println(cliente[i].toString());
		}
	}
	
}
