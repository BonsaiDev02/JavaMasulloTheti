public class Catalogo {

	 private Telefono[] telefoni;
	 private int telefoniVenduti;
	 private int numeroTelefoni;
	 
	 public Catalogo() {
		 telefoni = new Telefono[100];
		 telefoniVenduti = 0;
		 numeroTelefoni = 0;
	 }
	 
	 public void addTelefono(Telefono telefono) 
	    {
	        this.telefoni[numeroTelefoni] = new Telefono(telefono);  
	        this.numeroTelefoni+=1;
	    }
	 
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
	 
	  
	    public int vendiTelefono(int codice) 
	    {
	        int res = -2;
	        
	        for (int i = 0; i < numeroTelefoni; i++) 
	        {
	            if (codice == telefoni[i].getCodice()) 
	            {
	                res = telefoni[i].subQty(1);
	            }
	        }
	        return res;
	    }
	    
	    /**
	     * 
	     */
	    public int getAllDisponibilita() 
	    {
	        int disp = 0;
	        for (int i = 0; i < this.numeroTelefoni; i++) 
	        {
	            disp = disp + this.telefoni[i].getQty();
	        }
	        return disp;
	    }
	    
	    /**
	     * 
	     */
	 
	 public Telefono getTelefono(int codice) 
	    {
	        Telefono telefono = null;
	        for (int i = 0; i < this.numeroTelefoni; i++) 
	        {
	            if (codice == this.telefoni[i].getCodice()) 
	            {
	                telefono = telefoni[i];
	                i = 101;
	            }
	        }
	        return telefono;
	    }
	 
	public int getIndiceTelefono(Telefono telefono) {
	 
		int i;
		for (i = 0; i < this.numeroTelefoni; i++)  {
			if (telefono.getCodice() == this.telefoni[i].getCodice()) {
			return i;
			}
		}
		return 0;	
	}

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
	
	public void listino() {
		
		Telefono[] tel = new Telefono[100];
		for(int i=0; i<numeroTelefoni; i++) {
			
			tel[i] = new Telefono();
			System.out.println(tel[i].toString());
			}
	}
}