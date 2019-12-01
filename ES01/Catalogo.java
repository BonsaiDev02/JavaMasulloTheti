/***
 * La classe Catalogo gestisce le operazioni da effettuare alla classe Telefono
 * @author FABIO
 * @version v1.1
 */
public class Catalogo {

	//ATTRIBUTI
	
	 private Telefono[] telefoni;
	 private int telefoniVenduti;
	 private int numeroTelefoni;
	 
	 
	 //COSTRUTTORE
	 public Catalogo() {
		 telefoni = new Telefono[100];
		 telefoniVenduti = 0;
		 numeroTelefoni = 0;
	 }


	 /***
	  * Aggiungi un telefono nel catalogo
	  * 
	  */
	 public void addTelefono(Telefono telefono) 
	    {
	        this.telefoni[numeroTelefoni] = new Telefono(telefono);  
	        this.numeroTelefoni+=1;
	    }
	 
	 /***
	  * Rimuovi telefono nel catalogo
	  */
	 public void removeTelefono(int codice) {
		 Telefono telefono;
		 
		 telefono = getTelefono(codice);
		 
		 if( telefono != null) {
			 
			 int i = getIndiceTelefono(telefono);
			 for (int j = i +1; j < this.numeroTelefoni; j++) {
	                    telefoni[j-1] = telefoni[j];
	            }
	            numeroTelefoni--;
		 }
	 }
	 
	  /***
	   * Espelli un telefono
	   */
	    public int vendiTelefono(int codice) {
	    	
	        int res = -2;
	        
	        for (int i = 0; i < numeroTelefoni; i++) {
	        	
	            if (codice == telefoni[i].getCodice()) {
	                res = telefoni[i].subQty(1);
	            }
	        }
	        return res;
	    }
	    
	   /***
	    * Visualizzaa la quantità di tutti i cellulari 
	    * @return quantità totale
	    */
	    public int getAllQty() 
	    {
	        int disp = 0;
	        for (int i = 0; i < this.numeroTelefoni; i++) 
	        {
	            disp = disp + this.telefoni[i].getQty();
	        }
	        return disp;
	    }
	    
 
    /***
     * Visualizza telefono desiderato tramite codice
     * @param codice
     * @return Telefono
     */
	 public Telefono getTelefono(int codice)  {
	        Telefono telefono = null;
	        for (int i = 0; i < this.numeroTelefoni; i++) {
	            if (codice == this.telefoni[i].getCodice()) {
	                telefono = telefoni[i];
	                i = 101;
	            }
	        }
	        return telefono;
	    }

	public void listino() {
		for(int i=0; i<numeroTelefoni; i++) {
			System.out.println(telefoni[i].toString());
			}
	}
	
	//METODI GETTER E SETTER
	public Telefono[] getTelefoni() {
		return telefoni;
	}
	
	public void setTelefoni(Telefono[] telefoni) {
		this.telefoni = telefoni;
	}

	public int getTelefoniVenduti() {
		return telefoniVenduti;
	}

	public void setTelefoniVenduti(int telefoniVenduti) {
		this.telefoniVenduti = telefoniVenduti;
	}

	public int getNumeroTelefoni() {
		return numeroTelefoni;
	}

	public void setNumeroTelefoni(int numeroTelefoni) {
		this.numeroTelefoni = numeroTelefoni;
	}
	
	//METODO INTERNO ALLA CLASSE
	private int getIndiceTelefono(Telefono telefono) {
		 
		int i;
		for (i = 0; i < this.numeroTelefoni; i++)  {
			if (telefono.getCodice() == this.telefoni[i].getCodice()) {
			return i;
			}
		}
		return 0;	
	}
}